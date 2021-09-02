package com.example.sendgriddemo.service;

import com.example.sendgriddemo.domain.EmailConfig;
import com.example.sendgriddemo.repositoty.jpa.EmailConfigRepository;
import com.example.sendgriddemo.repositoty.schema.EmailConfigEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
public class EmailConfigService {
  private final EmailConfigRepository emailConfigRepository;

  public EmailConfig createEmailConfig(EmailConfig emailConfig) {
    var emailConfigEntity = new EmailConfigEntity();
    BeanUtils.copyProperties(emailConfig, emailConfigEntity, "id");
    var entity = emailConfigRepository.save(emailConfigEntity);
    var domain = new EmailConfig();
    BeanUtils.copyProperties(entity, domain);
    return domain;
  }

  public EmailConfig getEmailConfigByEmailCode(String emailCode) {
    var entity =
        emailConfigRepository
            .findByEmailCode(emailCode)
            .orElseThrow(() -> new RuntimeException("Not Found"));
    var domain = new EmailConfig();
    BeanUtils.copyProperties(entity, domain);
    return domain;
  }

  public EmailConfig updateEmailConfigByEmailCode(String code, EmailConfig emailConfig) {
    var emailConfigEntity =
        emailConfigRepository.findByEmailCode(code).orElseThrow(RuntimeException::new);
    BeanUtils.copyProperties(emailConfig, emailConfigEntity, "id");
    var entity = emailConfigRepository.save(emailConfigEntity);
    var domain = new EmailConfig();
    BeanUtils.copyProperties(entity, domain);
    return domain;
  }
}
