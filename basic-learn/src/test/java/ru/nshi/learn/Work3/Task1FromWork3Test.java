package ru.nshi.learn.Work3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.nshi.learn.Work2.Task1FromWork2;

import static org.junit.jupiter.api.Assertions.*;

public class Task1FromWork3Test {
    Task1FromWork3 t1w3;
    Task1FromWork2 t1w2;

    @BeforeEach
    void setUp() {
        t1w3 = new Task1FromWork3();
        t1w2 = new Task1FromWork2();
    }

    @Test
    void testSumRows(){
        int[][] array = {{11, 1, 1, 2}, {4, 10, 5, 4}, {7, 1, 8, 9}, {7, 7, 7, 0}};
        int[] sums = {15, 23, 25, 21};
        int[] sumMethod = t1w3.sumElementsRows(array, false);
        assertArrayEquals(sumMethod, sums);
    }
}
