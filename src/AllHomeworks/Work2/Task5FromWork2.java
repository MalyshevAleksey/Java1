package AllHomeworks.Work2;
import static AllHomeworks.Work2.Task3FromWork2.isMax;
import static AllHomeworks.Work2.Task3FromWork2.isMin;

public class Task5FromWork2 {
    public static void main(String[] args) {
        Task1FromWork2 applicationTask1 = new Task1FromWork2();
        Task4FromWork2 applicationTask4 = new Task4FromWork2();
        double average = 0;
        int length = 5;
        int rndRangeMin = -50;
        int rndRangeMax = 50;
        int[] array = applicationTask1.createAndFillArrayByRnd(length, rndRangeMin, rndRangeMax);
        applicationTask1.printIntArray(array);
        int max = isMax(array);
        int min = isMin(array);
        int maxIndex = getIndex(array, max);
        int minIndex = getIndex(array, min);
        System.out.print("\n");
        int [] correctInterval = determiningCorrectInterval(minIndex, maxIndex);
        System.out.println("Interval (indexes): "+ correctInterval[0]+" "+correctInterval[1]);
        int lenthInterval = correctInterval[1] - correctInterval[0];
        average = averageInterval(correctInterval, array, lenthInterval);
        System.out.println("Average interval: " + average);
    }
    public static int getIndex(int [] array, int number) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==number) {
                number=array[i];
                index = i;
            }
        }
        return index;
    }
    public static int[] determiningCorrectInterval(int numberOne, int numberTwo) {
        int [] correctInterval = new int[2];
        if (numberOne > numberTwo) {
            numberOne += numberTwo;
            numberTwo = numberOne - numberTwo;
            numberOne -= numberTwo;
        }
        correctInterval[0] = numberOne;
        correctInterval[1] = numberTwo;
        return correctInterval;
    }
    public static double averageInterval(int[] correctInterval, int[] array, int lenthInterval) {
        double average = 0;
        for (int i = correctInterval[0]; i <= correctInterval[1]; i++) {
            average += array[i];
        }
        average /= lenthInterval + 1;
        return average;
    }
}
