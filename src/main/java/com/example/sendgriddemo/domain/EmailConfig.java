package com.example.sendgriddemo.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import java.util.UUID;

@Getter
@Setter
@Accessors(chain = true)
public class EmailConfig {
  private UUID id;
  private String emailCode;
  private String htmlBody;
  private String template;
}
