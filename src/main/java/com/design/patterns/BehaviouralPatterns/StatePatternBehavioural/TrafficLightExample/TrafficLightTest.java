package com.design.patterns.BehaviouralPatterns.StatePatternBehavioural.TrafficLightExample;

public class TrafficLightTest {
    public static void main(String[] args) {
        TrafficLightContext trafficLightContext = new TrafficLightContext();
        System.out.println(trafficLightContext.getColor());
        trafficLightContext.next();
        System.out.println(trafficLightContext.getColor());
        trafficLightContext.next();
        System.out.println(trafficLightContext.getColor());
        trafficLightContext.next();
        System.out.println(trafficLightContext.getColor());
        trafficLightContext.next();
        System.out.println(trafficLightContext.getColor());
    }
}
