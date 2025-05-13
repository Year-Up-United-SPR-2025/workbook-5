package com.pluralsight;

public class Car extends Vehicle {
    public void color() {
        setColor("brown");
    }

    public void passengers() {
        setNumberOfPassengers(4);
    }

    public void cargo() {
        setCargoCapacity(400);
    }

    public void fuel() {
        setFuelCapacity(80);
    }

    public void safeInWeather() {
        setWeatherProof(true);
    }

    public void license() {
        setLicense("Class A");
    }
}
