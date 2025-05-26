/**
 * UserService and NotificationService example is an example of Dependency Injection (DI)!
 * But it was done in pure Java manually, not using Spring (yet).
 */
package com.springcore.loosecoupling;

public class LooseCouplingMain {
    public static void main(String[] args) {
        NotificationService email = new EmailNotification();
        UserService user1 = new UserService(email); // Dependecy Injection Manually by You { No Spring}
        user1.registerUser("Aanchal");

        NotificationService sms = new SMSNotification();
        UserService user2 = new UserService(sms);
        user2.registerUser("Gautam");

        NotificationService push = new PushNotification();
        UserService user3 = new UserService(push);
        user3.registerUser("Aniket");

        /**
         What You Achieved Here:
         UserService does not care how the notification is sent.

         You can easily switch between Email, SMS, Push, WhatsApp, etc.

         No code change required in UserService class — just inject a new implementation.

         */


    }


}