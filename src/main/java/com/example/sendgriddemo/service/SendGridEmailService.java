package com.example.sendgriddemo.service;

import com.example.sendgriddemo.model.EmailData;
import com.sendgrid.*;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class SendGridEmailService {
  private final Configuration freemakerConfig;

  @Value("${mail.sendgrid.fromEmail}")
  private String senderEmail;

  @Value("${mail.sendgrid.senderName}")
  private String senderName;

  @Value("${mail.sendgrid.apiKey}")
  private String sandgridApiKey;

  public void sendEmailWithTemplate(EmailData emailData) throws IOException, TemplateException {

    SendGrid sendGrid = new SendGrid(sandgridApiKey);
    Mail mail = prepareEmail(emailData);

    Request request = new Request();
    request.setMethod(Method.POST);
    request.setEndpoint("mail/send");
    request.setBody(mail.build());

    try {
      sendGrid.api(request);
    } catch (Exception exception) {
      exception.printStackTrace();
    }
  }

  public Mail prepareEmail(EmailData emailData) throws TemplateException, IOException {

    Email sender = new Email(senderEmail, senderName);
    Mail mail = new Mail();
    mail.setFrom(sender);
    mail.setSubject(emailData.getSubject());

    for (String toEmail : emailData.getToEmailAddress()) {
      Personalization personalization = new Personalization();
      personalization.addTo(new Email(toEmail));
      var substitutionMap = emailData.getSubstitutionMap().get(toEmail);

      for (var map : substitutionMap.entrySet()) {
        personalization.addSubstitution(map.getKey(), map.getValue());
      }
      mail.addPersonalization(personalization);
    }

    String bodyHtml = this.getEmailBodyContent(emailData);
    Content contentHtml = new Content("text/html", bodyHtml);
    mail.addContent(contentHtml);
    return mail;
  }

  public String getEmailBodyContent(EmailData data) throws IOException, TemplateException {

    freemakerConfig.setClassForTemplateLoading(this.getClass(), "/email-templates");
    var freemarkerTemplate = freemakerConfig.getTemplate("email-template.ftl");
    Map<String, Object> model = new HashMap<>();
    model.put("mailBody", data.getBodyHtml());
    return FreeMarkerTemplateUtils.processTemplateIntoString(freemarkerTemplate, model);
  }
}
