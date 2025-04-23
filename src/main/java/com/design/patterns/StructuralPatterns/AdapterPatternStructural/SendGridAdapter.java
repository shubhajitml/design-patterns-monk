package com.design.patterns.StructuralPatterns.AdapterPatternStructural;

public class SendGridAdapter implements NotificationService{
    SendGridService sendGridService;

    public SendGridAdapter(SendGridService sendGridService) {
        this.sendGridService = sendGridService;
    }


    @Override
    public void send(String to, String subject, String body) {
        sendGridService.sendEmail(to, subject, body, "SendGridEmail@gmail.com");
    }
}
