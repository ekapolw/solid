package com.technicallab.codequality.solid.l;

public class Bicycle implements Transportation {
    @Override
    public void turnOnEngine() {
        throw new AssertionError("I do not have engine !");
    }

    @Override
    public void move() {
        System.out.println("Bicycle move.");
    }
}
