package ru.nshi.learn.Work6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SquareTest {

    @Test
    void squareTest(){
        double[] sides = {1, 1, 1, 1};
        Square square = new Square(sides);
        square.colour.setColourHSB(43,32,45);
        assertEquals(1, square.getArea());
        System.out.print(square.info());
    }

    @Test
    void squareExceptionTest(){
        double[] sides1 = {0, 10, 20, 30};
        assertThrows(IllegalArgumentException.class, () -> {
            Square square = new Square(sides1);
            square.colour.setColourRGB(543, 133, 130);
        });
        double[] sides2 = {22, 8, 22, 33};
        assertThrows(IllegalArgumentException.class, () -> {
            Square square = new Square(sides2);
            square.colour.setColourRGB(543, 133, 130);
        });
    }

}