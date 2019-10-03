package com.technicallab.codequality.solid.o;

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

}
