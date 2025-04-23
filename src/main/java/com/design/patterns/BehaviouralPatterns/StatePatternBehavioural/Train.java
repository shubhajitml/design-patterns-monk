package com.design.patterns.BehaviouralPatterns.StatePatternBehavioural;

public class Train implements TransportationMode {
    @Override
    public int calcETA() {
        System.out.println("Calculating ETA (Train)");
        return 2;
    }

    @Override
    public String getDirection() {
        return "Directions for Train";
    }
}
