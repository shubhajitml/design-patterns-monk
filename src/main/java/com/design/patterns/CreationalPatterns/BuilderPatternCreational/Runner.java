package com.design.patterns.CreationalPatterns.BuilderPatternCreational;

import com.design.patterns.CreationalPatterns.BuilderPatternCreational.car_components.Airbags;
import com.design.patterns.CreationalPatterns.BuilderPatternCreational.car_components.CentralLock;
import com.design.patterns.CreationalPatterns.BuilderPatternCreational.car_components.Engine;
import com.design.patterns.CreationalPatterns.BuilderPatternCreational.car_components.Fuel;
import com.design.patterns.CreationalPatterns.BuilderPatternCreational.car_components.MusicSystem;
import com.design.patterns.CreationalPatterns.BuilderPatternCreational.car_components.Seat;
import com.design.patterns.CreationalPatterns.BuilderPatternCreational.car_components.Steering;
import com.design.patterns.CreationalPatterns.BuilderPatternCreational.car_components.SunRoof;
import com.design.patterns.CreationalPatterns.BuilderPatternCreational.constructor_without_builder.CarWithConstructor;
import com.design.patterns.CreationalPatterns.BuilderPatternCreational.withSetters.CarWithSetters;

import com.google.common.collect.ImmutableList;


import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        final Engine engine = new Engine();
        final List<Seat> seats = new ArrayList<>();
        final Steering steering = new Steering();
        final SunRoof sunRoof = new SunRoof();
        final Airbags airbags = new Airbags();
        final MusicSystem musicSystem = new MusicSystem();
        final CentralLock centralLock = new CentralLock();

        /*
        * So many arguments and nulls we have to put
        * which will make Constructor looks ugly
        * */
        CarWithConstructor carWithConstructor = new CarWithConstructor(engine, Fuel.PETROL, seats, steering,
                null, null, null, null);

        /**
         * Using Setters
         * 1. You may make half baked objects by missing required properties
         * 2. Object becomes mutuable i.e. you can change it's properties after it's creation
         * **/
        CarWithSetters car2 = new CarWithSetters();
        car2.setEngine(engine);
        car2.setFuel(Fuel.DIESEL);
        car2.setAirBags(airbags);
        car2.setMusicSystem(musicSystem);

        // it should not allow you to replce the car engine to new one i.e. mutuable;
        car2.setEngine(new Engine());

        /**
         * Using builders
         * 1. Simple Design
         * 2. Looks clean, more readable
         * 3. Object remains immutable once it is build
         * **/

        CarBuilder car = CarBuilder.builder()
                .withEngine(engine)
                .withFuel(Fuel.DIESEL)
                .withSteerings(steering)
                .withSeats(ImmutableList.of())
                .withSunRoof(sunRoof)
                .withMusicSystem(musicSystem).build();

        CarBuilder car1 = CarBuilder.builder()
                .withEngine(engine)
                .withFuel(Fuel.DIESEL)
                .withSteerings(steering)
                .withSeats(ImmutableList.of())
                .withAirBags(airbags)
                .withCentralLock(centralLock)
                .withSunRoof(sunRoof)
                .withMusicSystem(musicSystem).build();



    }
}
