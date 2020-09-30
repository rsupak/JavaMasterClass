package com.rsupak;

class Car {
    private String name;
    private int cylinders;
    private int wheels;
    private boolean engine;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine() {
        System.out.println( "Car -> startEngine()");
    }

    public void accelerate() {
        System.out.println("Car -> accelerate()");
    }

    public void brake() {
        System.out.println("Car -> brake()");
    }
}

class Camry extends Car {
    public Camry() {
        super("Camry", 4);
    }

    @Override
    public void startEngine() {
        System.out.println("Camry -> startEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println("Camry -> accelerate()");
    }

    @Override
    public void brake() {
        System.out.println("Camry -> brake()");
    }
}

class CRV extends Car {
    public CRV() {
        super("CRV", 4);
    }

    @Override
    public void startEngine() {
        System.out.println("CRV -> startEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println("CRV -> accelerate()");
    }

    @Override
    public void brake() {
        System.out.println("CRV -> brake()");
    }
}



public class Main {
    public static void main(String[] args) {
        Car car = new Car("Base care", 8);
        car.startEngine();
        car.accelerate();
        car.brake();

        Camry camry = new Camry();
        CRV crv = new CRV();
    }
}
