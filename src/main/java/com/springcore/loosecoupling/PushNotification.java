package com.springcore.loosecoupling;

public class PushNotification implements NotificationService{
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Push : "+ message);
    }
}
