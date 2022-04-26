package ru.nshi.learn.Work1;

public class Task4FromWork1 {
    public static void main(String[] args) {
        Task3FromWork1 applT3W1 = new Task3FromWork1();
        int sum = 0;
        for(int num = 1000; num<=2000; num++) {
            boolean flag = applT3W1.isPrimeNumber(num);
            if (flag) {
                sum+=num;
            }
        }
        System.out.println(sum);
    }
}