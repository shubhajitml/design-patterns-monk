package com.design.patterns.CreationalPatterns.BuilderPatternCreational.withSetters;

import com.design.patterns.CreationalPatterns.BuilderPatternCreational.car_components.Airbags;
import com.design.patterns.CreationalPatterns.BuilderPatternCreational.car_components.CentralLock;
import com.design.patterns.CreationalPatterns.BuilderPatternCreational.car_components.Engine;
import com.design.patterns.CreationalPatterns.BuilderPatternCreational.car_components.Fuel;
import com.design.patterns.CreationalPatterns.BuilderPatternCreational.car_components.MusicSystem;
import com.design.patterns.CreationalPatterns.BuilderPatternCreational.car_components.Seat;
import com.design.patterns.CreationalPatterns.BuilderPatternCreational.car_components.Steering;
import com.design.patterns.CreationalPatterns.BuilderPatternCreational.car_components.SunRoof;

import java.util.List;

public class CarWithSetters {
    // Required Properties
    private Engine engine;
    private Fuel fuel;
    private List<Seat> seats;
    private Steering steering;

    // Optional Properties
    private Airbags airBags;
    private CentralLock centralLock;
    private MusicSystem musicSystem;
    private SunRoof sunRoof;

    public void setEngine(Engine engine){
        this.engine = engine;
    }

    public void setFuel(Fuel fuel){
        this.fuel = fuel;
    }

    public void setSeats(List<Seat> seats){
        this.seats = seats;
    }

    public void setSteering(Steering steering){
        this.steering = steering;
    }

    public void setAirBags(Airbags airBags){
        this.airBags = airBags;
    }

    public void setCentralLock(CentralLock centralLock){
        this.centralLock = centralLock;
    }

    public void setMusicSystem(MusicSystem musicSystem){
        this.musicSystem = musicSystem;
    }

    public void setSunRoof(SunRoof sunRoof){
        this.sunRoof = sunRoof;
    }
}
