package org.example.Creational;

public class emailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("email Notification sent to the customer");
    }
}
