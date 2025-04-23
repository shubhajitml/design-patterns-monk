package com.design.patterns.BehaviouralPatterns.StatePatternBehavioural;

public class Walking implements TransportationMode {
    @Override
    public int calcETA() {
        System.out.println("Calculating ETA (Walking)");
        return 30;
    }

    @Override
    public String getDirection() {
        return "Directions for Walking";
    }
}
