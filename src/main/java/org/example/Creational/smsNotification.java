package org.example.Creational;

public class smsNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("SMS notification sent to the customer");
    }
}
