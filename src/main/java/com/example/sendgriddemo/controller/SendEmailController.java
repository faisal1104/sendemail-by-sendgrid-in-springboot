package com.example.sendgriddemo.controller;

import com.example.sendgriddemo.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
@RequiredArgsConstructor
public class SendEmailController {
  private final EmailService emailService;

  @PostMapping
  public void sendEmail(){
    emailService.sendEmail();
  }
}
