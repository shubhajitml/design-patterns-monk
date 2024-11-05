package com.design.patterns.CreationalPatterns.BuilderPatternCreational.constructor_without_builder;


import com.design.patterns.CreationalPatterns.BuilderPatternCreational.car_components.*;
import lombok.NonNull;

import java.util.List;

public class CarWithConstructor {
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

    // single constructor
    public CarWithConstructor(@NonNull Engine engine, @NonNull Fuel fuel, @NonNull List<Seat> seats, @NonNull Steering steering,
                              Airbags airBags, CentralLock centralLock, MusicSystem musicSystem, SunRoof sunRoof){
        this.engine = engine;
        this.fuel = fuel;
        this.seats = seats;
        this.airBags = airBags;
        this.centralLock = centralLock;
        this.musicSystem = musicSystem;
        this.sunRoof = sunRoof;
    }

    // Multiple Constructor for each combination
    public CarWithConstructor(@NonNull Engine engine, @NonNull Fuel fuel, @NonNull List<Seat> seats, @NonNull Steering steering,
                              Airbags airBags, MusicSystem musicSystem, SunRoof sunRoof){
        this.engine = engine;
        this.fuel = fuel;
        this.seats = seats;
        this.airBags = airBags;
        this.musicSystem = musicSystem;
        this.sunRoof = sunRoof;
    }

    public CarWithConstructor(@NonNull Engine engine, @NonNull Fuel fuel, @NonNull List<Seat> seats, @NonNull Steering steering,
                              Airbags airBags, CentralLock centralLock, MusicSystem musicSystem){
        this.engine = engine;
        this.fuel = fuel;
        this.seats = seats;
        this.airBags = airBags;
        this.centralLock = centralLock;
        this.musicSystem = musicSystem;
    }

}
