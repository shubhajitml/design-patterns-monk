package com.design.patterns.BehaviouralPatterns.StatePatternBehavioural.TrafficLightExample;

public class YellowColorState implements TrafficLightState{
    @Override
    public void next(TrafficLightContext context) {
        System.out.println("Switching from YELLOW to RED. Stop!");
        context.setState(new RedColorState());
    }

    @Override
    public TrafficLightColor getColor() {
        return TrafficLightColor.YELLOW;
    }
}
