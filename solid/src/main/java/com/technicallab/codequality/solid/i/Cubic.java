package com.technicallab.codequality.solid.i;

public class Cubic implements ShapeInterface {
    @Override
    public String area() {
        return "Return total area of 6 faces.";
    }

    @Override
    public String volume() {
        return "W*L*H";
    }
}
