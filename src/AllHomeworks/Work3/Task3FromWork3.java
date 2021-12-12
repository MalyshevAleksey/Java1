package AllHomeworks.Work3;
import AllHomeworks.Work2.Task1FromWork2;

import static AllHomeworks.Work1.Task1FromWork1.sysInInt;
import static AllHomeworks.Work2.Task1FromWork2.createArray;
import static AllHomeworks.Work3.Task1FromWork3.*;
import static AllHomeworks.Work3.Task2FromWork3.sumElementsColumns;
public class Task3FromWork3 {
    public static void main(String[] args) {
        Task3FromWork3 applicationWork3Task3 = new Task3FromWork3();
        int length = sysInInt("Введите количество строк и столбцов (одно число): ");
        int rndRangeMin = 0, rndRangeMax = 99;
        int[][] array = createAndFillTDA(length, rndRangeMin, rndRangeMax);
        printTwoDimensionalArray(array);
        if (applicationWork3Task3.isItMagicSquare(array)) {
            System.out.println("Матрица является магическим квадратом!");
        }
        else {
            System.out.println("Матрица не является магическим квадратом!");
        }
    }
    public boolean isItMagicSquare(int[][] array) {
        boolean flag = false;
        int sumRows = summAll(sumElementsRows(array));
        int sumColumns = summAll(sumElementsColumns(array));;
        int sumDiagonals = summAll(sumElementsDiagonal(array));;
        if (sumColumns == sumDiagonals && sumColumns == sumRows) {
            flag = true;
        }
        return flag;
    }
    public static int summAll(int [] elem) {
        int summ = 0;
        for(int i = 0; i < elem.length; i++) {
            summ = elem[i];
        }
        return summ;
    }
    public static int[] sumElementsDiagonal(int [][] array) {
        int summMainDiagonal = 0, summSideDiagonal = 0;
        int[] result = createArray(2);
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
        return result;
    }
    public void outSummColumns(int length, int[] result) {
        System.out.printf("Сумма элементов главной диагонали: %d", result[0]);
        System.out.printf("Сумма элементов побочной диагонали: %d", result[1]);
    }
}
