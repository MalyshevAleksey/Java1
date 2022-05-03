package ru.nshi.learn.Work6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {

    @Test
    void circleTest(){
        Circle circle = new Circle(10);
        double area = circle.getArea();
        circle.colour.setColourHSB(43,32,45);
        System.out.print(circle.info());
        assertEquals(Math.PI*100.0, area);
    }

    @Test
    void circleExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> {
            Circle circle = new Circle(-1);
            circle.colour.setColourRGB(0, 0, -2);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Circle circle = new Circle(10);
            circle.colour.setColourRGB(543, 133, 130);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Circle circle = new Circle(0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Circle circle = new Circle(31);
            circle.colour.setColourHSB(-1, 10, 10);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Circle circle = new Circle(43);
            circle.colour.setColourHSB(43, 134, 1321);
        });
    }
}