package ru.nshi.learn.Work4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task5FromWork4Test {
    Task5FromWork4 t5w4;

    @BeforeEach
    void setUp() {
        t5w4 = new Task5FromWork4();
    }

    @Test
    void uniq() {
        char[] str = {'a', 'b', 'c', 'c', 'a', 'b', 'd', 's'}; //abccabds
        String res = "abcds";
        String methodTest = t5w4.uniqueSymbolsInStr(str);
        assertEquals(res, methodTest);
    }
}
