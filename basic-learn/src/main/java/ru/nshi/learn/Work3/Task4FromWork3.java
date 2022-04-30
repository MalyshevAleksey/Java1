package ru.nshi.learn.Work3;
import ru.nshi.learn.Work1.Task1FromWork1;
import ru.nshi.learn.Work2.Task1FromWork2;

public class Task4FromWork3 {
    public static void main(String[] args) {
        int rndRangeMin = 0, rndRangeMax = 99;
        Task1FromWork1 appl = new Task1FromWork1();
        Task1FromWork3 applT1W3 = new Task1FromWork3();
        Task4FromWork3 applT4W3 = new Task4FromWork3();
        int length = appl.sysInInt("Введите к-во столбцов и строк (одно число): ");
        int[][] array = applT1W3.createAndFillTDA(length, rndRangeMin, rndRangeMax);
        applT1W3.printTwoDimensionalArray(array);
        System.out.println("Массив после сортировки: ");
        applT1W3.printTwoDimensionalArray(applT4W3.sortedArray(array));
    }
    public int [][] sortedArray(int [][] array) {
        Task1FromWork2 applT1W2 = new Task1FromWork2();
        int [] sortArray = applT1W2.createArray(array.length * array.length);
        int k = 0;
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sortArray[k] = array[i][j];
                k++;
            }
        }
        for (int i = 0; i < sortArray.length; i++)
        {
            int min = i;
            for (int j = i + 1; j < sortArray.length; j++)
            {
                if (sortArray[j] < sortArray[min])
                {
                    min = j;
                }
            }
            int dummy = sortArray[i];
            sortArray[i] = sortArray[min];
            sortArray[min] = dummy;
        }
        k = 0;
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = sortArray[k];
                k++;
            }
        }
        return array;
    }
}
