package com.springcore.tightcoupling;

public class TightCouplingMain {
 public static void main(String[] args)
    {
        UserService user1 = new UserService(); // always uses NotificationService internally
        user1.registerUser("Aanchal");
    }
}

//❌ Problems in This Approach:
//❌ Not flexible :
// You cannot switch to SMSNotification or PushNotification without modifying the UserService code.

