package com.design.patterns.BehaviouralPatterns.StatePatternBehavioural;

public class WithStatePatternMain {
    public static void main(String[] args) {
        DirectionServiceContext directionServiceContext = new DirectionServiceContext(new Cycling());
        System.out.println("ETA: " + directionServiceContext.getETA());
        System.out.println("Direction: " + directionServiceContext.getDirection());
        System.out.println();


        directionServiceContext.changeTransportationMode(new Biking());
        System.out.println("ETA: " + directionServiceContext.getETA());
        System.out.println("Direction: " + directionServiceContext.getDirection());

    }
}
