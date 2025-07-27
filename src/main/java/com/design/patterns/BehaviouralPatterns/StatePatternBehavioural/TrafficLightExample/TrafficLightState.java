package com.design.patterns.BehaviouralPatterns.StatePatternBehavioural.TrafficLightExample;

public interface TrafficLightState {
    void next(TrafficLightContext context);
    TrafficLightColor getColor();
}
