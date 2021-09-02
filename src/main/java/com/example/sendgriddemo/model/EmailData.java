package com.example.sendgriddemo.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Map;

@Data
@Accessors(chain = true)
public class EmailData implements Serializable {
  private String[] toEmailAddress;
  private String subject;
  private String bodyHtml;
  private Map<String, Object> templateModels;
  private Map<String, Map<String, String>> substitutionMap;
}
