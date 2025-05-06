package com.design.patterns.BehaviouralPatterns.ObserverPatternBehavioural;

public class ObserverPatternMain {

    public static void main(String[] args) {
        // Create publisher
        WeatherStation weatherStation = new WeatherStation();
        // Create subscribers/observers
        SmartPhoneDevice smartPhoneDevice = new SmartPhoneDevice();
        SmartTVDevice smartTVDevice = new SmartTVDevice();

        // add observers
        weatherStation.addObserver(smartPhoneDevice);
        weatherStation.addObserver(smartTVDevice);

        // set temperature
        weatherStation.setTemperature(38.5f);

        weatherStation.setTemperature(34.2f);
        weatherStation.removeObserver(smartPhoneDevice);
        weatherStation.setTemperature(35);


    }
}
