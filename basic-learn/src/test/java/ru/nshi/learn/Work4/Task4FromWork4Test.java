package ru.nshi.learn.Work4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task4FromWork4Test {
    Task4FromWork4 t4w4;

    @BeforeEach
    void setUp() {
        t4w4 = new Task4FromWork4();
    }

    @Test
    void sumNumsStr() {
        char[] str = {'1', '0', '0', '0', '-', '7', '=', '?'};
        int res = 8;
        int sumNums = t4w4.summNumbersInString(str);
        assertEquals(res, sumNums);
    }
}
