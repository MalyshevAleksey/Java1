package ru.nshi.learn.Work4;

public class Task4FromWork4 {
    public static void main(String args[]) {
        Task1FromWork4 applT1W4 = new Task1FromWork4();
        Task4FromWork4 applT4W4 = new Task4FromWork4();
        char [] charArray = applT1W4.sysInStrTypeArrayChar("Введите строку: ");
        int summNumbers = applT4W4.summNumbersInString(charArray);
        System.out.print(summNumbers);
    }
    public int summNumbersInString(char [] charArray) {
        String string;
        int summ = 0;
        for(char ch: charArray) {
            string = String.valueOf(ch);
            if (string.matches("[0-9]")) {
                summ+=ch - '0';
            }
        }
        return summ;
    }
}
