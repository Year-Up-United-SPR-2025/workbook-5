package com.pluralsight;

public class Dog extends Animal {

    private String breed;

    public Dog(String name){
        super(name);

        this.breed = "poodle";
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void bark() {

        setName("rover");
        name = "rover";
        System.out.println(name + "Ruff, ruff!");
    }
}
