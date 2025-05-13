package com.pluralsight;

public class Animal {
    protected String name;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //protected is assessable from any class
    protected void digest(){
    }
}
