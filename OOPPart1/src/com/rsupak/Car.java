package com.rsupak;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;


    /* Getters */

    public int getDoors() {
        return this.doors;
    }

    public int getWheels() {
        return this.wheels;
    }

    public String getModel() {
        return this.model;
    }

    public String getEngine() {
        return this.engine;
    }

    public String getColor() {
        return this.color;
    }


    /* Setters */

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
