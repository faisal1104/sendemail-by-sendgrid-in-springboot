package com.example.sendgriddemo.service;

import com.example.sendgriddemo.emaildata.EmailDataFiller;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmailService {
  private final SendGridEmailService sendGridEmailService;

  public void sendTournamentAnnouncementEmail(String fromTime) {
    var emailList = List.of("faisal1104a@gmail.com", "faisal.ahammad@ymail.com");
    var emailData = EmailDataFiller.tournamentAnnouncementDataFiller(emailList, fromTime);
    try {
      sendGridEmailService.sendEmailWithTemplate(emailData);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void sendRegistrationConfirmationEmail(String name) {
    var emailData =
        EmailDataFiller.registrationConfirmationEmailDataFiller(name, "faisal1104a@gmail.com");
    try {
      sendGridEmailService.sendEmailWithTemplate(emailData);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
