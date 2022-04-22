package ru.nshi.learn.Work3;

import ru.nshi.learn.Work1.Task1FromWork1;
import ru.nshi.learn.Work2.Task1FromWork2;

import java.util.Random;

public class Task1FromWork3 {
    public static void main(String[] args) {
        Task1FromWork1 applT1W1 = new Task1FromWork1();
        Task1FromWork3 applT1W3 = new Task1FromWork3();
        int length = applT1W1.sysInInt("Введите количество строк и столбцов (число): ");
        int rndRangeMin = 0, rndRangeMax = 99;
        int[][] array = applT1W3.createAndFillTDA(length, rndRangeMin, rndRangeMax);
        applT1W3.printTwoDimensionalArray(array);
        applT1W3.sumElementsRows(array, true);
    }
    public int[][] createAndFillTDA(int length, int rndRangeMin, int rndRangeMax) {
        int[][] array = new int[length][length];
        Random rnd = new Random();
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                array[i][j] = rnd.nextInt(rndRangeMin, rndRangeMax+1);
            }
        }
        return array;
    }
    public void printTwoDimensionalArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public int [] sumElementsRows(int [][] array, boolean flag) {
        int summ = 0;
        Task1FromWork2 applT1W2 = new Task1FromWork2();
        int[] result = applT1W2.createArray(array.length);
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                summ += array[i][j];
            }
            result[i] = summ;
            summ = 0;
        }
        if (flag) {
            for (int i = 0; i < array.length; i++) {
                System.out.printf("Сумма элементов %d-й строки: %d\n", i+1, result[i]);
            }
        }
        return result;
    }
}
