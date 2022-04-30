package ru.nshi.learn.Work1;

public class Task2FromWork1 {
    public static void main(String[] args) {
        Task2FromWork1 application = new Task2FromWork1();
        int sum = application.summElements();
        System.out.println(sum);
    }
    public int summElements() {
        Task1FromWork1 appl = new Task1FromWork1();
        int sum = 0;
        for(int num = 100000; num<=999999; num++) {
            boolean flag = appl.isLuckyNumber(num);
            if (flag) {
                sum += num;
            }
        }
        return sum;
    }
}
