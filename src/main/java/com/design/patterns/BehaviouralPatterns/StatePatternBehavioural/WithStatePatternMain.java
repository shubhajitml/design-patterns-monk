package com.design.patterns.BehaviouralPatterns.StatePatternBehavioural;

public class WithStatePatternMain {
    public static void main(String[] args) {
        DirectionService directionService = new DirectionService(new Cycling());
        System.out.println("ETA: " + directionService.getETA());
        System.out.println("Direction: " + directionService.getDirection());
        System.out.println();


        directionService.changeTransportationMode(new Biking());
        System.out.println("ETA: " + directionService.getETA());
        System.out.println("Direction: " + directionService.getDirection());

    }
}
