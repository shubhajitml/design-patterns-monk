package com.design.patterns.BehaviouralPatterns.StatePatternBehavioural.TrafficLightExample;

public class GreenColorState implements TrafficLightState {
    @Override
    public void next(TrafficLightContext context) {
        System.out.println("Switching from GREEN to YELLOW. Slow down!");
        context.setState(new YellowColorState());
    }

    @Override
    public TrafficLightColor getColor() {
        return TrafficLightColor.GREEN;
    }
}
