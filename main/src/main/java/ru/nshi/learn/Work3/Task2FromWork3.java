package ru.nshi.learn.Work3;

import ru.nshi.learn.Work1.Task1FromWork1;
import ru.nshi.learn.Work2.Task1FromWork2;

public class Task2FromWork3 {
    public static void main(String[] args) {
        Task1FromWork1 applT1W1 = new Task1FromWork1();
        Task1FromWork3 applT1W3 = new Task1FromWork3();
        Task2FromWork3 applT2W3 = new Task2FromWork3();
        int length = applT1W1.sysInInt("Введите количество строк и столбцов (число): ");
        int rndRangeMin = 0, rndRangeMax = 99;
        int[][] array = applT1W3.createAndFillTDA(length, rndRangeMin, rndRangeMax);
        applT1W3.printTwoDimensionalArray(array);
        applT2W3.sumElementsColumns(array, true);
    }
    public int [] sumElementsColumns(int [][] array, boolean flag) {
        int summ = 0;
        Task1FromWork2 appl = new Task1FromWork2();
        int[] result = appl.createArray(array.length);
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                summ += array[j][i];
            }
            result[i] = summ;
            summ = 0;
        }
        if (flag) {
            for (int i = 0; i < array.length; i++) {
                System.out.printf("Сумма элементов %d-ого столбца: %d\n", i+1, result[i]);
            }
        }
        return result;
    }
}
