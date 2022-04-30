package ru.nshi.learn.Work4;

import java.util.Scanner;

public class Task7FromWork4 {
    public static void main(String[] args) {
        Task6FromWork4 applT6W4 = new Task6FromWork4();
        Task7FromWork4 applT7W4 = new Task7FromWork4();
        String str = applT7W4.sysInStrTypeString("Введите слова через пробел: ");
        System.out.println(applT6W4.wordWithMaxCountUniqSymbols(str.trim().split("\\s+")));
    }
    public String sysInStrTypeString(String outScreen) {
        System.out.print(outScreen);
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        return str;
    }
}
