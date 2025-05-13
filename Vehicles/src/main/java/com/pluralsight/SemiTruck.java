package com.pluralsight;

public class SemiTruck extends Vehicle {
    public void color() {
        setColor("gray");
    }

    public void passengers() {
        setNumberOfPassengers(4);
    }

    public void cargo() {
        setCargoCapacity(80000);
    }

    public void fuel() {
        setFuelCapacity(150);
    }

    public void safeInWeather() {
        setWeatherProof(true);
    }

    public void license() {
        setLicense("Class B");
    }


}
