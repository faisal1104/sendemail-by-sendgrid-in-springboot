package com.example.sendgriddemo.emaildata;

import com.example.sendgriddemo.model.EmailData;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmailDataFiller {
  public static EmailData systemEmailDataFiller() {

    Map<String, Map<String, String>> model = new HashMap<>();

    Map<String, String> substitutionMap1 = new HashMap<>();
    substitutionMap1.put("$email$", "faisal_admin@yopmail.com");
    substitutionMap1.put("$firstName$", "Faisal");
    model.put("faisal_admin@yopmail.com", substitutionMap1);

    Map<String, String> substitutionMap2 = new HashMap<>();
    substitutionMap2.put("$email$", "faisal1104a@gmail.com");
    substitutionMap2.put("$firstName$", "Ahammad");
    model.put("faisal1104a@gmail.com", substitutionMap2);

    var email = List.of("faisal1104a@gmail.com", "faisal_admin@yopmail.com");
    String bodyHtml =
             "<p class='email-content'>Our system will be on maintenance from 01 Sep 2021, 06:55 PM to 03 Sep 2021, 10:40 AM (UTC +00:00)"
            + " for Server Maintainance Test. Due to this scheduled system maintenance, our website will be temporarily unavailable."
            + "We apologize in advance for any inconvenience this may cause.</p>";

    EmailData data = new EmailData();
    data.setSubject("Test Email By Faisal")
        .setToEmailAddress(email.toArray(new String[0]))
        .setBodyHtml(bodyHtml);

    data.setSubstitutionMap(model);
    return data;
  }

  public static EmailData registrationEmailDataFiller() {
    var email = List.of("faisal1104a@gmail.com", "faisal_admin@yopmail.com");
    String bodyHtml =
        "<h3 class='title'>Congratulations ${email}!</h3>"
            + "<p class='subtitle'>Your account for the Convenience Pay product/service has been created!</p>"
            + "<p class='email-content'>You're requested to reset your password to login into the panel!</p>";

    EmailData data = new EmailData();
    data.setSubject("Test Email By Faisal")
        .setToEmailAddress(email.toArray(new String[0]))
        .setBodyHtml(bodyHtml);

    return data;
  }
}
