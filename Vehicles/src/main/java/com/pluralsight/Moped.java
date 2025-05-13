package com.pluralsight;

public class Moped extends Vehicle {

    public void color(){
        setColor("teal");
    }

    public void passengers(){
        setNumberOfPassengers(1);
    }

    public void cargo(){
        setCargoCapacity(25);
    }

    public void fuel(){
        setFuelCapacity(100);
    }

    public void safeInWeather(){
        setWeatherProof(false);
    }

    public void license(){
        setLicense("Class B");
    }


}
