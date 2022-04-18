package ru.nshi.learn.Work3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.nshi.learn.Work2.Task1FromWork2;

import static org.junit.jupiter.api.Assertions.*;

public class Task2FromWork3Test {
    Task2FromWork3 t2w3;
    Task1FromWork2 t1w2;

    @BeforeEach
    void setUp() {
        t2w3 = new Task2FromWork3();
        t1w2 = new Task1FromWork2();
    }

    @Test
    void testSumRows(){
        int[][] array = {{11, 1, 1, 2}, {4, 10, 5, 4}, {7, 1, 8, 9}, {7, 7, 7, 0}};
        int[] sums = {29, 19, 21, 15};
        int[] sumMethod = t2w3.sumElementsColumns(array, false);
        assertArrayEquals(sumMethod, sums);
    }
}
