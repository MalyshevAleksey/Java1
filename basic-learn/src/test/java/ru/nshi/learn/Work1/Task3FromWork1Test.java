package ru.nshi.learn.Work1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class Task3FromWork1Test {
    Task3FromWork1 t3w3;

    @BeforeEach
    void setUp() {
        t3w3 = new Task3FromWork1();
    }

    @ParameterizedTest
    @ValueSource ( ints = {2, 181, 11} )
    void testIsSimple(int num) {
        boolean simpleNum = t3w3.isPrimeNumber(num);
        assertTrue(simpleNum);
    }

    @ParameterizedTest
    @ValueSource ( ints = {4, 182, 12} )
    void testIsNotSimple(int num) {
        boolean simpleNum = t3w3.isPrimeNumber(num);
        assertFalse(simpleNum);
    }
}
