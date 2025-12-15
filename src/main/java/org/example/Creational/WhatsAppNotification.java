package org.example.Creational;

public class WhatsAppNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("WhatsAPp notification sent to the customer");
    }
}
