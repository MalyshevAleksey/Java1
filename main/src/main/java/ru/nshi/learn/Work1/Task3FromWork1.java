package ru.nshi.learn.Work1;

public class Task3FromWork1 {
    public static void main(String[] args) {
        Task1FromWork1 applT1W1 = new Task1FromWork1();
        int num = applT1W1.sysInInt("Введите число: ");
        Task3FromWork1 applT3W1 = new Task3FromWork1();
        boolean flag = applT3W1.isPrimeNumber(num);
        if (flag) {
            System.out.println("Число простое!");
        }
        else {
            System.out.println("Число не является простым!");
        }
    }
    public boolean isPrimeNumber(int num) {
        int count = 0;
        boolean flag = false;
        if (num==2) {
            flag = true;
        }
        else if (num%2!=0) {
            for(int i = 1; i<=num; i+=2) {
                if (num%i==0) {
                    count+=1;
                }
            }
            if (count==2) {
                flag = true;
            }
        }
        return flag;
    }
}