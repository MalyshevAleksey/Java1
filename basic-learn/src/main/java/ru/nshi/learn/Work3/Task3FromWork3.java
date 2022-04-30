package ru.nshi.learn.Work3;

import ru.nshi.learn.Work1.Task1FromWork1;
import ru.nshi.learn.Work2.Task1FromWork2;

public class Task3FromWork3 {
    public static void main(String[] args) {
        Task1FromWork2 applT1W2 = new Task1FromWork2();
        Task3FromWork3 applT3W3 = new Task3FromWork3();
        Task1FromWork1 applT1W1 = new Task1FromWork1();
        Task2FromWork3 applT2W3 = new Task2FromWork3();
        Task1FromWork3 applT1W3 = new Task1FromWork3();
        int length = applT1W1.sysInInt("Введите количество строк и столбцов (одно число): ");
        int rndRangeMin = 0, rndRangeMax = 99;
        int[][] array = applT1W3.createAndFillTDA(length, rndRangeMin, rndRangeMax);
        applT1W3.printTwoDimensionalArray(array);
        int [] resultAllParties = applT3W3.allResult(applT2W3.sumElementsColumns(array, false),
                applT1W3.sumElementsRows(array, false),
                applT3W3.sumElementsDiagonal(array, false));
        applT3W3.isItMagicSquare(resultAllParties);
    }
    public void isItMagicSquare(int [] array) {
        boolean flag = true;
        int i = 0;
        int copy = array[0];
        while ((i < array.length) && (flag)) {
            if (copy != array[i]) {
                flag = false;
            }
            i++;
        }
        if (flag) {
            System.out.println("Матрица является магическим квадратом!");
        }
        else {
            System.out.println("Матрица не является магическим квадратом!");
        }
    }
    public int[] allResult(int [] columns, int [] rows, int [] diagonal) {
        Task1FromWork2 applT1W2 = new Task1FromWork2();
        int [] result = applT1W2.createArray(columns.length + rows.length + 2);
        int count = 0;
        for(int i = 0; i < columns.length; i++) {
            result[i] = columns[i];
            count ++;
        }
        for(int i = 0; i < rows.length; i++) {
            result[count] = rows[i];
            count ++;
        }
        for(int i = 0; i < diagonal.length; i++) {
            result[count] = diagonal[i];
            count ++;
        }
        return result;
    }
    public int[] sumElementsDiagonal(int [][] array, boolean flag) {
        int summMainDiagonal = 0, summSideDiagonal = 0;
        Task1FromWork2 applT1W2 = new Task1FromWork2();
        int[] result = applT1W2.createArray(2);
        for(int i = 0; i < array.length; i++) {
            summMainDiagonal += array[i][i];
            for(int j = 0; j < array.length; j++) {
                if (i + j == array.length - 1) {
                    summSideDiagonal += array[i][j];
                }
            }
        }
        result[0] = summMainDiagonal;
        result[1] = summSideDiagonal;
        if (flag) {
            System.out.printf("Сумма элементов главной диагонали: %d", result[0]);
            System.out.printf("Сумма элементов побочной диагонали: %d", result[1]);
        }
        return result;
    }
}
