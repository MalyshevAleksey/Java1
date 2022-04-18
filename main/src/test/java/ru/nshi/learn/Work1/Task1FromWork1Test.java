package ru.nshi.learn.Work1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class Task1FromWork1Test {
    Task1FromWork1 t1w1;

    @BeforeEach
    void setUp() {
        t1w1 = new Task1FromWork1();
    }

    @ParameterizedTest
    @ValueSource( ints = {123321, 145532, 111003} )
    void testIsLuck(int num) {
        boolean isLuckNum = t1w1.isLuckyNumber(num);
        assertTrue(isLuckNum);
    }

    @ParameterizedTest
    @ValueSource( ints = {121321, 1255532, 110003} )
    void testIsNotLuck(int num) {
        boolean isLuckNum = t1w1.isLuckyNumber(num);
        assertFalse(isLuckNum);
    }
}
