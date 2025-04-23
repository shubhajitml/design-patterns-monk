package com.design.patterns.BehaviouralPatterns.StatePatternBehavioural;

public class Cycling implements TransportationMode{
    @Override
    public int calcETA() {
        System.out.println("Calculating ETA (Cycling)");
        return 20;
    }

    @Override
    public String getDirection() {
        return "Directions for Cycling";
    }
}
