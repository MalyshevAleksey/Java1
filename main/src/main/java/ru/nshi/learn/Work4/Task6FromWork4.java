package ru.nshi.learn.Work4;

import java.util.Scanner;

public class Task6FromWork4 {
    public static void main(String[] args) {
        Task6FromWork4 applT6W4 = new Task6FromWork4();
        String[] arrayStr = applT6W4.arrayWordsStr();
        System.out.println(applT6W4.wordWithMaxCountUniqSymbols(arrayStr));
    }
    public String[] arrayWordsStr() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество слов: ");
        int countWords = in.nextInt();
        String[] arrayWords = new String[countWords];
        for (int i = 0; i < countWords; i++){
            System.out.printf("Напишите %d-е слово: ", i+1);
            arrayWords[i] = in.next();
        }
        return arrayWords;
    }
    public String wordWithMaxCountUniqSymbols(String[] arrayStr) {
        Task5FromWork4 applT5W4 = new Task5FromWork4();
        String maxUniqWord = new String();
        String[] arrayUniqueStr = new String[arrayStr.length];
        int index = 0;
        for (String string: arrayStr) {
            arrayUniqueStr[index] = applT5W4.uniqueSymbolsInStr(string.toCharArray());
            index++;
        }
        for (int i = 1; i < arrayUniqueStr.length; i++){
            if (arrayUniqueStr[i].length() > arrayUniqueStr[i-1].length()) {
                maxUniqWord = arrayStr[i];
            }
            else {
                maxUniqWord = arrayStr[i-1];
            }
        }
        return maxUniqWord;
    }
}
