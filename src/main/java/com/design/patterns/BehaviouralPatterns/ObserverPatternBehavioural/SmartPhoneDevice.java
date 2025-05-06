package com.design.patterns.BehaviouralPatterns.ObserverPatternBehavioural;

public class SmartPhoneDevice implements WeatherStationObserver {
    @Override
    public void update(float temperature) {
        System.out.println("Device: " + this.getClass().getSimpleName() +
                " | Current Temperature: " + temperature + "°C");
    }
}
