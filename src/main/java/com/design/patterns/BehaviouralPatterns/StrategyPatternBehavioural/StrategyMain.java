package com.design.patterns.BehaviouralPatterns.StrategyPatternBehavioural;

public class StrategyMain {
    public static void main(String[] args) {
        ShoppingCartService cartService = new ShoppingCartService();

        cartService.addItem(new Item("101", 50000));
        cartService.addItem(new Item("102", 2000));
        PaymentStrategy upiPayment = new UpiStrategy("user@upi", "Jindal Tata", "YES Bank");
        cartService.pay(upiPayment);

        ShoppingCartService cartService2 = new ShoppingCartService();
        cartService2.addItem(new Item("103", 10000));
        cartService2.addItem(new Item("104", 5000));
        PaymentStrategy creditCardPayment = new CreditCardStrategy("John Nair","1234567890123456", "123", "12/27");
        cartService2.pay(creditCardPayment);
    }
}
