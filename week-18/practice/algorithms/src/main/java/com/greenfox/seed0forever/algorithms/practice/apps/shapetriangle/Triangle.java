package com.greenfox.seed0forever.algorithms.practice.apps.shapetriangle;

public class Triangle extends Shape {

  private Double heightA;
  private Double sideA;
  private Double sideB;
  private Double sideC;

  public Triangle(double sideA, double heightA) {
    this.sideA = sideA;
    this.heightA = heightA;
  }

  public Triangle(double sideA, double sideB, double sideC) {
    if (!isInputValid(sideA, sideB, sideC)) {
      throw new IllegalArgumentException();
    }
    this.sideA = sideA;
    this.sideB = sideB;
    this.sideC = sideC;
  }

  private boolean isInputValid(double sideA, double sideB, double sideC) {
    boolean validSideA = sideA < sideB + sideC;
    boolean validSideB = sideB < sideA + sideC;
    boolean validSideC = sideC < sideA + sideB;
    return validSideA && validSideB && validSideC;
  }

  private boolean isHeightGivenForSideA() {
    return !(null == heightA);
  }

  @Override
  public double getArea() {
    return isHeightGivenForSideA() ? calculateAreaBySideAndHeight() : calculateAreaByThreeSides();
  }

  private double calculateAreaByThreeSides() {
    double halfPerimeter = (sideA + sideB + sideC) / 2.0;
    double areaByHeronFormula =
        Math.sqrt(
            halfPerimeter
                * (halfPerimeter - sideA)
                * (halfPerimeter - sideB)
                * (halfPerimeter - sideC));
    return areaByHeronFormula;
  }

  private double calculateAreaBySideAndHeight() {
    return (sideA * heightA) / 2;
  }
}
