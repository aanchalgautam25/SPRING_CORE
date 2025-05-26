package com.springcore.tightcoupling;

public class UserService
{

    // Directly creating NotificationService in class [ UserService tightlu coupled with NotificationService]

    private NotificationService notificationService = new NotificationService();

    public void registerUser(String username)
    {
        System.out.println("registering : "+username);
        notificationService.sendNotification("Welcome "+username+" !");

    }
}
