package com.springcore.loosecoupling;

public class UserService {
    private NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void registerUser(String username)
    {
        System.out.println("Registering user : "+username);
        notificationService.sendNotification("Welcome "+username+" !");
    }

}