package com.technicallab.codequality.solid.l;

public class Caller {
    public static void main(String[] args) {
        Transportation[] listOfTransportation = new Transportation[2];
        listOfTransportation[0] = new Car();
        listOfTransportation[1] = new Bicycle();

        for (Transportation theTrans : listOfTransportation) {
            theTrans.turnOnEngine();
            theTrans.move();
        }
    }
}
