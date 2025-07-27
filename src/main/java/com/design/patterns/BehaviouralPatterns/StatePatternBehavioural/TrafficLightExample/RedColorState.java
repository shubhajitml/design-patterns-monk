package com.design.patterns.BehaviouralPatterns.StatePatternBehavioural.TrafficLightExample;

public class RedColorState implements TrafficLightState {
    @Override
    public void next(TrafficLightContext context) {
        System.out.println("Switching from RED to GREEN. Go!");
        context.setState(new GreenColorState());
    }

    @Override
    public TrafficLightColor getColor() {
        return TrafficLightColor.RED;
    }
}
