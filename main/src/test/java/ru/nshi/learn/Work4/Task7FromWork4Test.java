package ru.nshi.learn.Work4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task7FromWork4Test {
    Task6FromWork4 t6w4;

    @BeforeEach
    void setUp() {
        t6w4 = new Task6FromWork4();
    }

    @Test
    void uniqWords() {
        String str = "I'm Naruto Uzumaki Oshi he teo shi hiteo sono sikumi wo Naruto dattebao";
        String uWord = t6w4.wordWithMaxCountUniqSymbols(str.trim().split("\\s+"));
        assertEquals("Naruto", uWord);
    }
}
