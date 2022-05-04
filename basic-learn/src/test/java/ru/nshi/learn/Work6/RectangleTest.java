package ru.nshi.learn.Work6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    void rectangleTest(){
        double arr1[] = {4, 1, 4, 1};
        Rectangle rectangle1 = new Rectangle(arr1);
        rectangle1.colour.setColourHSB(43,32,45);
        assertEquals(4, rectangle1.getArea());
        System.out.print(rectangle1.info());

        double arr2[] = {4, 11, 4, 11};
        Rectangle rectangle2 = new Rectangle(arr2);
        rectangle2.colour.setColourHSB(43,32,45);
        assertEquals(44, rectangle2.getArea());
        System.out.print(rectangle2.info());
    }

    @Test
    void rectangleExceptionTest(){
        double arr[] = {1, 2, 3, 4};
        assertThrows(IllegalArgumentException.class, () -> {
            Rectangle rectangle = new Rectangle(arr);
            rectangle.colour.setColourRGB(543, 133, 130);
        });
    }
}