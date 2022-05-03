package ru.nshi.learn.Work6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {

    @Test
    void triangleTest(){
        double[] sides = {3, 4, 5};
        Triangle triangle = new Triangle(sides);
        triangle.colour.setColourHSB(43,32,45);
        assertEquals(6, triangle.getArea());
        System.out.print(triangle.info());
    }

    @Test
    void triangleExceptionTest(){
        double[] sides1 = {5, 0, 23};
        assertThrows(IllegalArgumentException.class, () -> {
            Triangle triangle = new Triangle(sides1);
            triangle.colour.setColourRGB(543, 133, 130);
        });
        double[] sides2 = {-1, 27, -438};
        assertThrows(IllegalArgumentException.class, () -> {
            Triangle triangle = new Triangle(sides2);
            triangle.colour.setColourRGB(543, 133, 130);
        });
    }

}