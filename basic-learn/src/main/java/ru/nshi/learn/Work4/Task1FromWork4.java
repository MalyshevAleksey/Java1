package ru.nshi.learn.Work4;

import java.util.Scanner;

public class Task1FromWork4 {
    public static void main(String args[]) {
        Task1FromWork4 applT1W4 = new Task1FromWork4();
        char [] charArray = applT1W4.sysInStrTypeArrayChar("Введите строчку: ");
        String out = "";
        for (int i = 0; i < charArray.length; i++) {
            out = applT1W4.sysOutChars(charArray, i);
            System.out.println(out);
        }
    }
    public char[] sysInStrTypeArrayChar(String outScreen) {
        System.out.print(outScreen);
        Scanner in = new Scanner(System.in);
        char [] string = in.next().toCharArray();
        return string;
    }
    public String sysOutChars(char [] ch, int i) {
        boolean flag = true;
        String buff = "";
        for (int j = 0; j <= i; j++) {
            buff += ch[j];
        }
        return buff;
    }
}