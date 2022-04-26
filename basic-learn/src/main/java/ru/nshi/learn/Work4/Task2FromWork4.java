package ru.nshi.learn.Work4;

public class Task2FromWork4 {
    public static void main(String args[]) {
        Task1FromWork4 applT1W4 = new Task1FromWork4();
        Task2FromWork4 applT2W4 = new Task2FromWork4();
        char [] charArray = applT1W4.sysInStrTypeArrayChar("Введите строчку: ");
        String onlyUpper = applT2W4.onlyUpperLetter(charArray);
        if (onlyUpper == "") {
            System.out.println("All letters are lowercase");
        }
        else {
            System.out.println(onlyUpper);
        }
    }
    public String onlyUpperLetter(char [] charArray) {
        String onlyUpper = "";
        for(char letter: charArray) {
            if(Character.isUpperCase(letter)) {
                onlyUpper += letter;
            }
        }
        return onlyUpper;
    }
}
