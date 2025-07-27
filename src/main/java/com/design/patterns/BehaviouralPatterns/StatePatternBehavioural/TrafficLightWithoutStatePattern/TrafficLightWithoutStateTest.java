package com.design.patterns.BehaviouralPatterns.StatePatternBehavioural.TrafficLightWithoutStatePattern;

public class TrafficLightWithoutStateTest {
    public static void main(String[] args) {
        TrafficLightWitoutStatePattern trafficLight = new TrafficLightWitoutStatePattern();
        trafficLight.next(); // from RED to GREEN
        trafficLight.next(); // from GREEN to YELLOW
        trafficLight.next(); // from YELLOW to RED
    }
}
