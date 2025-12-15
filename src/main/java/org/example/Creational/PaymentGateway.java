package org.example.Creational;

// Singletion class pattern
public class PaymentGateway {
    public static volatile PaymentGateway paymentGatewayInstance;
    PaymentGateway(){
        System.out.println("Initializing Payment Gateway");
    }

    public static PaymentGateway getPaymentGatewayInstance() {
        if(paymentGatewayInstance == null) {
            synchronized (PaymentGateway.class) {
                if(paymentGatewayInstance == null){
                    paymentGatewayInstance = new PaymentGateway();
                }
            }
        }
        return paymentGatewayInstance;
    }

    public void processPayment(String orderId, double amount) {
        System.out.println("Processing Payment of: " + amount + "for Order Id:" + orderId);
    }
}
