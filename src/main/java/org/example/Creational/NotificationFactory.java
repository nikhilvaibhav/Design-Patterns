package org.example.Creational;

public class NotificationFactory {
    public static Notification createNotification(String type){
        if(type.equals("email")){
            return new emailNotification();
        }
        else if(type.equals("sms")){
            return new smsNotification();
        }
        else if(type.equals("whatsapp")){
            return new WhatsAppNotification();
        }
        else {
            throw new IllegalArgumentException("Invalid Notification type provided");
        }
    }
}
