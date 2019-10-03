package com.technicallab.codequality.solid.s;

public class AreaCalculator {

  private Shape[] shapes;

  public AreaCalculator(Shape[] shapes) {
    this.shapes = shapes;
  }

  public double sum() {
    double total = 0;

    for (Shape theShape : shapes) {
      if (theShape instanceof Square) {
        total += ((Square) theShape).length * ((Square) theShape).length;
      } else if (theShape instanceof Circle) {
        total += ((Circle) theShape).radius * 2 * 3.14;
      }
    }

    return total;

  }

  public String output() {
    return "The sum of areas of provided shapes : " + this.sum();
  }

}
