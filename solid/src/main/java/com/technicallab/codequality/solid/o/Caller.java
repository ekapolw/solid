package com.technicallab.codequality.solid.o;

public class Caller {

  public static void main(String[] args) {

    Shape[] listOfShape = new Shape[2];
    listOfShape[0] = new Circle(3);
    listOfShape[1] = new Square(2);


    AreaCalculator calculator = new AreaCalculator(listOfShape);

    System.out.println("Sum of Area : " + calculator.sum());


  }

}
