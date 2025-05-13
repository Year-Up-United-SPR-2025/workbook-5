package com.pluralsight;


public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.setBreed("poodle");
        d.setName("rover"); //inherits from Animal(parent)

        d.bark();

        System.out.println(d);

        Animal a = new Animal();
        a.digest();

    }
}
