package org.example;


import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void countPerimeterEgyptTriangle() {

        Triangle triangle = new Triangle(2, 5, 5);  //arrange
        int perimeter = triangle.countPerimeter();  //Act
        Assert.assertEquals(12, perimeter);
    }

    @Test
    public void countPerimeterMore90() {
        Triangle triangle = new Triangle(5, 4, 5);  //arrange
        int perimeter = triangle.countPerimeter();  //Act
        Assert.assertEquals(14, perimeter);
    }
    @Test

        public void hasToBe13() {
            Triangle triangle = new Triangle(2, 4, 5);  //arrange
            int perimeter = triangle.countPerimeter();  //Act
            Assert.assertEquals(11, perimeter);
        }

    @Test
    public void negativeCountPerimeterEgyptTriangle() {
        Triangle triangle = new Triangle(0, 5, 5);
       IllegalAccessException illegalAccessException= Assert.assertThrows(IllegalAccessException.class, triangle::countPerimeter);
       Assert.assertEquals("set the size to the sides", illegalAccessException.getMessage());
    }

    @Test
    public void negativeCountPerimeterMore90() {
        Triangle triangle = new Triangle(12, 0, 5);
        IllegalAccessException illegalAccessException= Assert.assertThrows(IllegalAccessException.class, triangle::countPerimeter);
        Assert.assertEquals("set the size to the sides", illegalAccessException.getMessage());
    }
    @Test

    public void negativeHasToBe13() {
        Triangle triangle = new Triangle(0, -1, 5);
        IllegalAccessException illegalAccessException= Assert.assertThrows(IllegalAccessException.class, triangle::countPerimeter);
        Assert.assertEquals("set the size to the sides", illegalAccessException.getMessage());
    }
    }

