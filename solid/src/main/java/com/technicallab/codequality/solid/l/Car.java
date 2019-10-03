package com.technicallab.codequality.solid.l;

public class Car implements Transportation {
    @Override
    public void turnOnEngine() {
        System.out.println("Turn on Engine.");
    }

    @Override
    public void move() {
        System.out.println("Car move.");
    }
}
