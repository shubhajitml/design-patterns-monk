package com.design.patterns.BehaviouralPatterns.StatePatternBehavioural;

public class Biking implements TransportationMode {
    @Override
    public int calcETA() {
        System.out.println("Calculating ETA (Biking)");
        return 10;
    }

    @Override
    public String getDirection() {
        return "Directions for Biking";
    }
}
