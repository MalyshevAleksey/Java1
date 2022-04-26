package ru.nshi.learn.Work4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Task3FromWork4Test {
    Task3FromWork4 t3w4;

    @BeforeEach
    void setUp() {
        t3w4 = new Task3FromWork4();
    }

    @Test
    void onlyNums() {
        char[] str = {'1', '0', '0', '0', '-', '7', '=', '?'};
        char[] res = {'1', '0', '0', '0', '7'};
        char[] onlyNums = t3w4.arrayCharOnlyNumber(str);
        assertArrayEquals(res, onlyNums);
    }
}
