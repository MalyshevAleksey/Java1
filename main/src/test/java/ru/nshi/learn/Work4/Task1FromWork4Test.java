package ru.nshi.learn.Work4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1FromWork4Test{

    Task1FromWork4 t1w4;

    @BeforeEach
    void setUp() {
        t1w4 = new Task1FromWork4();
    }

    @Test
    void test1CutString(){
        char[] charArray = {'Н', 'у', ' ', 'е', 'м', 'а', 'е'};
        String[] sample = {"Н", "Ну", "Ну ", "Ну е", "Ну ем", "Ну ема", "Ну емае"};
        String out;
        for (int i = 0; i < charArray.length; i++) {
            out = t1w4.sysOutChars(charArray, i);
            assertEquals(out, sample[i]);
        }
    }
}