package com.design.patterns.StructuralPatterns.AdapterPatternStructural;

public class Client {
    public static void main(String[] args) {
        NotificationService legacyEmailNotificationService = new LegacyEmailNotificationService();
        legacyEmailNotificationService.send("care@lld.com", "Test Subject", "Test Body");

        NotificationService sendGridEmailNotificationService = new SendGridAdapter(new SendGridService());
        sendGridEmailNotificationService.send("care@lld.com", "Test Subject2", "Test Body2");
    }
}
