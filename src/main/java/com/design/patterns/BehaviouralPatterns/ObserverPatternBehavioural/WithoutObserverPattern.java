package com.design.patterns.BehaviouralPatterns.ObserverPatternBehavioural;

class WeatherStationWithoutObserver {
    private float temperature;
    private MobileDisplayDevice displayDevice;

    public WeatherStationWithoutObserver(MobileDisplayDevice displayDevice){
        this.displayDevice = displayDevice;
    }

    public void setTemperature(float temperature){
        this.temperature = temperature;
        notifyDevice();
    }

    private void notifyDevice(){
        displayDevice.showTemperature(temperature);
    }
}

class MobileDisplayDevice {
    void showTemperature(float temp){
        System.out.println("Current Temperature: " + temp + " C");
    }
}

public class WithoutObserverPattern {

    public static void main(String[] args) {
        MobileDisplayDevice displayDevice = new MobileDisplayDevice();
        WeatherStationWithoutObserver weatherStationWithoutObserver = new WeatherStationWithoutObserver(displayDevice);
        weatherStationWithoutObserver.setTemperature(50);


    }
}
