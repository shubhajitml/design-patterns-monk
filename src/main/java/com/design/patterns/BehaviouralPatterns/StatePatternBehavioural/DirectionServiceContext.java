package com.design.patterns.BehaviouralPatterns.StatePatternBehavioural;

// Context Class for State Pattern
public class DirectionServiceContext {
    TransportationMode transportationMode;

    DirectionServiceContext(TransportationMode transportationMode) {
        this.transportationMode = transportationMode;
    }

    public void changeTransportationMode(TransportationMode transportationMode) { // state change method
        this.transportationMode = transportationMode;
    }

    public int getETA(){
        return transportationMode.calcETA();
    }

    public String getDirection(){
        return transportationMode.getDirection();
    }
}
