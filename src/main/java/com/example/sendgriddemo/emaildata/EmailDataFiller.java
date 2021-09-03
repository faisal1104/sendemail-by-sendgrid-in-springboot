package com.example.sendgriddemo.emaildata;

import com.example.sendgriddemo.domain.EmailData;
import java.util.*;

public class EmailDataFiller {
  public static EmailData tournamentAnnouncementDataFiller(List<String> emails, String fromTime) {

    Map<String, Map<String, String>> model = new HashMap<>();
    for (var email : emails) {
      Map<String, String> substitutionMap = new HashMap<>();
      substitutionMap.put("$email$", email);
      substitutionMap.put("$fromTime$", fromTime);
      model.put(email, substitutionMap);
    }

    return new EmailData()
        .setSubject("New Tournament Announcement!")
        .setToEmailAddress(emails.toArray(String[]::new))
        .setEmailCode("Tournament Announcement")
        .setDynamicValueMap(model);
  }

  public static EmailData registrationConfirmationEmailDataFiller(String name, String email) {

    Map<String, Map<String, String>> model = new HashMap<>();
    Map<String, String> substitutionMap = new HashMap<>();
    substitutionMap.put("$name$", name);
    substitutionMap.put("$token$", String.valueOf(new Random().nextInt(Integer.MAX_VALUE)));
    model.put(email, substitutionMap);

    String[] mails = {email};

    return new EmailData()
        .setSubject("Registration Successful!")
        .setToEmailAddress(mails)
        .setDynamicValueMap(model)
        .setEmailCode("Registration Successful");
  }
}
