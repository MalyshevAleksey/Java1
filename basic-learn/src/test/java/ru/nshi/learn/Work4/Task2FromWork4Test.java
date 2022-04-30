package ru.nshi.learn.Work4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task2FromWork4Test {
    Task2FromWork4 t2w4;

    @BeforeEach
    void setUp() {
        t2w4 = new Task2FromWork4();
    }

    @Test
    void testOnlyUp1() {
        char [] charArray = {'A', 'M', 'a', 'b', 'O', 'N', 'G', 'o', 'b', 'Y', 'S', 'a'};
        String onlyUpper = t2w4.onlyUpperLetter(charArray);
        assertEquals(onlyUpper, "AMONGYS");
    }

    @Test
    void testOnlyUp2() {
        char [] charArray = {'i', 'm', 'g', 'h', 'o', 'l'};
        String onlyUpper = t2w4.onlyUpperLetter(charArray);
        assertEquals(onlyUpper, "");
    }
}
