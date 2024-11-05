package com.design.patterns.BehaviouralPatterns.StrategyPatternBehavioural;

public class UpiStrategy implements PaymentStrategy{

    private String upiId;
    private String name;
    private String bankName;

    public UpiStrategy(String upiId, String name, String bankName){
        this.upiId = upiId;
        this.name = name;
        this.bankName = bankName;
    }
    @Override
    public void pay(int amount) {
        System.out.println("UPI payment of ₹" + amount + " is successful");
    }
}
