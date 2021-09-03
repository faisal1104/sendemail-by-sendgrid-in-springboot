package com.example.sendgriddemo.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Map;

@Data
@Accessors(chain = true)
public class EmailData implements Serializable {
  private String emailCode;
  private String[] toEmailAddress;
  private String subject;
  private Map<String, Object> templateModels;
  private Map<String, Map<String, String>> dynamicValueMap;
}
