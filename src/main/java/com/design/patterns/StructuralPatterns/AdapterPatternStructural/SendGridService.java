package com.design.patterns.StructuralPatterns.AdapterPatternStructural;

public class SendGridService {

    public void sendEmail(String recipient, String subject, String body, String sender) {
        System.out.println("SendGrid Email Service");
        System.out.println("Sending email to: " + recipient);
        System.out.println("Sending email from: " + sender);
        System.out.println("Subject: " + subject);
        System.out.println("Body:" + body);
    }
}
