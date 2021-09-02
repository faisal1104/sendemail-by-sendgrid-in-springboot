package com.example.sendgriddemo.controller;

import com.example.sendgriddemo.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/send-email")
@RequiredArgsConstructor
public class SendEmailController {
  private final EmailService emailService;

  @PostMapping("tournament-announcement")
  public void sendTournamentAnnouncementEmail(@RequestParam String fromTime) {
    emailService.sendTournamentAnnouncementEmail(fromTime);
  }

  @PostMapping("registration-confirmation")
  public void sendRegistrationConfirmationEmail(@RequestParam String name) {
    emailService.sendRegistrationConfirmationEmail(name);
  }
}
