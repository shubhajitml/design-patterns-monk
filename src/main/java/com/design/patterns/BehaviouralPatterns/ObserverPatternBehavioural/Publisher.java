package com.design.patterns.BehaviouralPatterns.ObserverPatternBehavioural;

public interface Publisher {
    void addObserver(WeatherStationObserver observer);
    void removeObserver(WeatherStationObserver observer);
    void notifyObservers();
}
