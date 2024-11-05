package com.design.patterns.CreationalPatterns.BuilderPatternCreational;

import com.design.patterns.CreationalPatterns.BuilderPatternCreational.car_components.Airbags;
import com.design.patterns.CreationalPatterns.BuilderPatternCreational.car_components.CentralLock;
import com.design.patterns.CreationalPatterns.BuilderPatternCreational.car_components.Engine;
import com.design.patterns.CreationalPatterns.BuilderPatternCreational.car_components.Fuel;
import com.design.patterns.CreationalPatterns.BuilderPatternCreational.car_components.MusicSystem;
import com.design.patterns.CreationalPatterns.BuilderPatternCreational.car_components.Seat;
import com.design.patterns.CreationalPatterns.BuilderPatternCreational.car_components.Steering;
import com.design.patterns.CreationalPatterns.BuilderPatternCreational.car_components.SunRoof;

import lombok.NonNull;

import java.util.List;

public class CarBuilder {

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

    public static Builder builder() { return new Builder(); }

    public static class Builder {
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

        public Builder withEngine(@NonNull final Engine engine){
            this.engine = engine;
            return this;
        }

        public Builder withFuel(@NonNull final Fuel fuel){
            this.fuel = fuel;
            return this;
        }

        public Builder withSeats(@NonNull final List<Seat> seats){
            this.seats = seats;
            return this;
        }

        public Builder withSteerings(@NonNull final Steering steering){
            this.steering = steering;
            return this;
        }

        public Builder withAirBags(@NonNull final Airbags airBags){
            this.airBags = airBags;
            return this;
        }

        public Builder withCentralLock(@NonNull final CentralLock centralLock){
            this.centralLock = centralLock;
            return this;
        }

        public Builder withMusicSystem(@NonNull final MusicSystem musicSystem){
            this.musicSystem = musicSystem;
            return this;
        }

        public Builder withSunRoof(@NonNull final SunRoof sunRoof){
            this.sunRoof = sunRoof;
            return this;
        }

        public CarBuilder build(){
            if(this.engine == null || this.steering == null || this.seats == null || this.fuel == null){
                throw new RuntimeException("All required properties are not present!");
            }
            CarBuilder car = new CarBuilder();
            car.engine = this.engine;
            car.fuel = this.fuel;
            car.seats = this.seats;
            car.steering = this.steering;
            car.airBags = this.airBags;
            car.centralLock = this.centralLock;
            car.musicSystem = this.musicSystem;
            car.sunRoof = this.sunRoof;
            return car;
        }

    }


}
