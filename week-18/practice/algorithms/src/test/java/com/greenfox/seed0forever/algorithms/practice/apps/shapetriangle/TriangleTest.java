package com.greenfox.seed0forever.algorithms.practice.apps.shapetriangle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TriangleTest {

  @Test
  public void getArea_TriangleByHeight_valid() throws Exception {
    //arrange
    Shape testTriangle = new Triangle(15.0, 11.0);
    //act
    double areaOfTriangle = testTriangle.getArea();
    //assert
    assertEquals(82.5, areaOfTriangle, 1E-15);
  }

  @Test
  public void getArea_TriangleByThreeSides_valid() throws Exception {
    //arrange
    Shape testTriangle = new Triangle(13.0, 14.0, 15.0);
    //act
    double areaOfTriangle = testTriangle.getArea();
    //assert
    assertEquals(84.0, areaOfTriangle, 1E-15);
  }

  @Test
  public void getArea_TriangleByThreeSides_invalid() throws Exception {
    //arrange
    Shape testTriangle = null;
    //act
    try {
      testTriangle = new Triangle(1.0, 14.0, 15.0);
      fail("Expected an IllegalArgumentException to be thrown");
    } catch (RuntimeException exception) {
      //assert
      assertTrue(exception instanceof IllegalArgumentException);
    }
  }
}
