package ru.nshi.learn.Work4;

public class Task3FromWork4 {
    public static void main(String args[]) {
        Task1FromWork4 applT1W4 = new Task1FromWork4();
        Task3FromWork4 applT3W4 = new Task3FromWork4();
        char [] charArray = applT1W4.sysInStrTypeArrayChar("Введите строчку: ");
        char [] onlyNumber = applT3W4.arrayCharOnlyNumber(charArray);
        applT3W4.printCharArray(onlyNumber);
    }
    public char [] arrayCharOnlyNumber(char [] charArray) {
        String string;
        char [] arrayNumbersInString = new char[countNumbersInString(charArray)];
        int index = 0;
        for(char ch: charArray) {
            string = String.valueOf(ch);
            if (string.matches("[0-9]")) {
                arrayNumbersInString[index] = ch;
                index++;
            }
        }
        return arrayNumbersInString;
    }
    public void printCharArray(char [] charArray) {
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i]+" ");
        }
    }
    public int countNumbersInString(char [] charArray) {
        String string;
        int count = 0;
        for(char ch: charArray) {
            string = String.valueOf(ch);
            if (string.matches("[0-9]")) {
                count++;
            }
        }
        return count;
    }
}
