package com.udemy.learning.oops.polymorphism;

// Polymorphism: Two types
//      - Method Overloading
//      - Method Overriding

// Method Overriding:
//      - Takes place at runtime
//      - We can call base class implementation using super keyword from derived class
//      - Also called Runtime Polymorphism or Late Binding
//      - We can not decrease visibility of the overridden method
//      - Ex: can not change public (in base class) to private or protected (in derived class)
//      - But we can increase the visibility of the overridden method
//      - Ex: can change protected (in base class) to public (in derived class)
//      - We can not override final or static methods


class Vehicle {
    public void run() {
        System.out.println("Vehicle is running.");
    }
}

class Car extends Vehicle {

    @Override
    public void run() {
        System.out.println("Car is running.");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.run();

        Car c = new Car();
        c.run();

        Vehicle vCar = new Car();
        vCar.run();
    }
}
