package com.springcore.loosecoupling;

public class EmailNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email :"+ message);
    }
}
