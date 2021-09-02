package com.example.sendgriddemo.controller;

import com.example.sendgriddemo.domain.EmailConfig;
import com.example.sendgriddemo.service.EmailConfigService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/email-configuration")
@RequiredArgsConstructor
public class EmailConfigurationController {
  private final EmailConfigService emailConfigService;

  @PostMapping
  public EmailConfig createEmailConfig(@RequestBody EmailConfig emailConfig) {
    return emailConfigService.createEmailConfig(emailConfig);
  }

  @GetMapping("/{code}")
  public EmailConfig getEmailConfigByEmailCode(@PathVariable String code) {
    return emailConfigService.getEmailConfigByEmailCode(code);
  }

  @PutMapping("/{code}")
  public EmailConfig updateEmailConfigByEmailCode(
      @PathVariable String code, @RequestBody EmailConfig emailConfig) {
    return emailConfigService.updateEmailConfigByEmailCode(code, emailConfig);
  }
}
