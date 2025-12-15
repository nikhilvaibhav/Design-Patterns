package org.example.Creational;

public class Order {
    private String Product;
    private String size;
    private boolean giftWrapped;
    private String color;
    private boolean bankOffer;

    private Order(orderBuilder builder){
        this.Product = builder.Product;
        this.size = builder.size;
        this.giftWrapped = builder.giftWrapped;
        this.color = builder.color;
        this.bankOffer = builder.bankOffer;
    }

    public void showOrderDetails(){
        System.out.println("Order details : " + Product + " , Size: " + size + " ,giftWrapped " + (giftWrapped ? " Yes ": " No "));
    }


    //builder
    public static class orderBuilder{
        private String Product;
        private String size;
        private boolean giftWrapped;
        private String color;
        private boolean bankOffer;

        // Mandatory field
        public orderBuilder(String Product){
            this.Product = Product;
        }

        // Optional fields as methods (not constructors)
        public orderBuilder size(String size){
            this.size = size;
            return this;
        }
        public orderBuilder giftWrapped(boolean giftWrapped){
            this.giftWrapped = giftWrapped;
            return this;
        }
        public orderBuilder color(String color){
            this.color = color;
            return this;
        }
        public orderBuilder bankOffer(boolean bankOffer){
            this.bankOffer = bankOffer;
            return this;
        }
        public Order build() {
            return new Order(this);
        }
    }
}
