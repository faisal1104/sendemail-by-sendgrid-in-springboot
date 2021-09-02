//package com.example.sendgriddemo.service;
//
//import com.fasterxml.jackson.annotation.JsonProperty;
//import com.sendgrid.*;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
//import java.io.IOException;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Map;
//
//@Service
//public class MailService {
//  @Value("${mail.sendgrid.fromEmail}")
//  private String senderEmail;
//
//  @Value("${mail.sendgrid.apiKey}")
//  private String sandgridApiKey;
//
//  public String sendTextEmail() throws IOException {
//    // the sender email should be the same as we used to Create a Single Sender Verification
//    Email from = new Email(senderEmail);
//    String subject = "Test Email";
//    Email to = new Email("faisal_sendgrid2@yopmail.com");
//
//    Content content = new Content("text/plain", "This is a test email v2");
//
//    Mail mail = new Mail(from, subject, to, content);
//
//    SendGrid sg = new SendGrid(sandgridApiKey);
//    Request request = new Request();
//    try {
//      request.setMethod(Method.POST);
//      request.setEndpoint("mail/send");
//      request.setBody(mail.build());
//      Response response = sg.api(request);
//      return response.getBody();
//    } catch (IOException ex) {
//      throw ex;
//    }
//  }
//
//  public String send() throws IOException {
//    // the sender email should be the same as we used to Create a Single Sender Verification
//    Email from = new Email(senderEmail);
//    Email to = new Email("zamil302@gmail.com");
//    Mail mail = new Mail();
//    // we create an object of our static class feel free to change the class on it's own file
//    // I try to keep every think simple
//    DynamicTemplatePersonalization personalization = new DynamicTemplatePersonalization();
//    personalization.addTo(to);
//    mail.setFrom(from);
//    mail.setSubject("Welcome To OOD");
//    // This is the first_name variable that we created on the template
//    personalization.addDynamicTemplateData("name", "Zamil Chowdhury");
//    mail.addPersonalization(personalization);
//    mail.setTemplateId("d-9ad3c713dbfd44e9b9ec3d392322e733");
//    // this is the api key
//    SendGrid sg = new SendGrid(sandgridApiKey);
//    Request request = new Request();
//
//    try {
//      request.setMethod(Method.POST);
//      request.setEndpoint("mail/send");
//      request.setBody(mail.build());
//      Response response = sg.api(request);
//      return response.getBody();
//    } catch (IOException ex) {
//      throw ex;
//    }
//  }
//}
//  // This class handels the dynamic data for the template
//  // Feel free to customise this class our to putted on other file
//  class DynamicTemplatePersonalization extends Personalization {
//
//    @JsonProperty(value = "dynamic_template_data")
//    private Map<String, String> dynamic_template_data;
//
//    @JsonProperty("dynamic_template_data")
//    public Map<String, String> getDynamicTemplateData() {
//      if (dynamic_template_data == null) {
//        return Collections.<String, String>emptyMap();
//      }
//      return dynamic_template_data;
//    }
//
//    public void addDynamicTemplateData(String key, String value) {
//      if (dynamic_template_data == null) {
//        dynamic_template_data = new HashMap<String, String>();
//        dynamic_template_data.put(key, value);
//      } else {
//        dynamic_template_data.put(key, value);
//      }
//    }
//}
