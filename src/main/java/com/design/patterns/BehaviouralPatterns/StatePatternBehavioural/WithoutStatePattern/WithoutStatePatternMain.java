package com.design.patterns.BehaviouralPatterns.StatePatternBehavioural.WithoutStatePattern;

public class WithoutStatePatternMain {
    public static void main(String[] args) {
        DirectionServiceWithoutStatePattern directionService = new DirectionServiceWithoutStatePattern(ModeOfTransport.WALKING);

        directionService.setMode(ModeOfTransport.CAR);
        System.out.println("ETA: " + directionService.getETA());
        System.out.println("Direction: " + directionService.getDirection());
    }
}
