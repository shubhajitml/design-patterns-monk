package com.design.patterns.StructuralPatterns.AdapterPatternStructural;

public class LegacyEmailNotificationService implements NotificationService{

    @Override
    public void send(String to, String subject, String body) {
        System.out.println("Legacy Email Notification Service");
        System.out.println("Sending email to: " + to);
        System.out.println("Subject: " + subject);
        System.out.println("Body:" + body);
    }
}
