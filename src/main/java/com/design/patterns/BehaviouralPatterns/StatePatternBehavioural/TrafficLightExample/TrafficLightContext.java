package com.design.patterns.BehaviouralPatterns.StatePatternBehavioural.TrafficLightExample;

public class TrafficLightContext {

    TrafficLightState currentState;

    public TrafficLightContext() {
        currentState = new RedColorState(); // initial state
    }

    public void setState(TrafficLightState state){
        this.currentState = state;
    }

    public void next(){
        currentState.next(this);
    }

    public TrafficLightColor getColor(){
        return currentState.getColor();
    }
}
