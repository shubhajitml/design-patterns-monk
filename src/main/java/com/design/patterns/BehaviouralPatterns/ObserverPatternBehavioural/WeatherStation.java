package com.design.patterns.BehaviouralPatterns.ObserverPatternBehavioural;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Publisher{
    private float temperature;
    private List<WeatherStationObserver> observerList;

    WeatherStation(){
        observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(WeatherStationObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(WeatherStationObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(WeatherStationObserver weatherStationObserver : observerList) {
            weatherStationObserver.update(temperature); // Runtime polymorphism
        }
    }

    public void setTemperature(float temperature){
        this.temperature = temperature;
        notifyObservers();
    }

}
