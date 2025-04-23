package com.design.patterns.BehaviouralPatterns.StatePatternBehavioural.WithoutStatePattern;


enum ModeOfTransport {
    WALKING,
    CYCLE,
    BIKE,
    CAR,
    TRAIN
}

public class DirectionServiceWithoutStatePattern {

    private ModeOfTransport mode;

    DirectionServiceWithoutStatePattern(ModeOfTransport mode) {
        this.mode = mode;
    }

    public void setMode(ModeOfTransport mode) {
        this.mode = mode;
    }

    public int getETA(){
        switch (mode){
            case WALKING:
                System.out.println("Calculated ETA for " + ModeOfTransport.WALKING + " mode is: 30");
                return 30;
            case CYCLE:
                System.out.println("Calculated ETA for " + ModeOfTransport.CYCLE + " mode is: 20");
                return 20;
            case BIKE:
                System.out.println("Calculated ETA for " + ModeOfTransport.BIKE + " mode is: 10");
                return 10;
            case CAR:
                System.out.println("Calculated ETA for " + ModeOfTransport.CAR + " mode is: 5");
                return 5;
            case TRAIN:
                System.out.println("Calculated ETA for " + ModeOfTransport.TRAIN + " mode is: 2");
                return 2;
            default:
                throw new IllegalArgumentException("Invalid mode of transportation");
        }
    }

    public String getDirection(){
        switch (mode){
            case WALKING:
                return "Direction for walking : Head north for 500m and then take left";
            case CYCLE:
                return "Direction for cycle : Take the cycle path towards the park";
            case BIKE:
                return "Direction for bike : Take outer ring road towards the city";
            case CAR:
                return "Direction for car : User overbridge towards Whitefield";
            case TRAIN:
                return "Direction for train : Board the redline at central station";
            default:
                throw new IllegalArgumentException("Invalid mode of transportation");
        }
        
    }
}
