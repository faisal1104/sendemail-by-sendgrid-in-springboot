package com.example.sendgriddemo.service;

import com.example.sendgriddemo.emaildata.EmailDataFiller;
import com.example.sendgriddemo.model.EmailData;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class EmailService {
  private final SendGridEmailService sendGridEmailService;

  public void sendEmail() {

    var emailData = EmailDataFiller.systemEmailDataFiller();
    try {
      sendGridEmailService.sendEmailWithTemplate(emailData);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
