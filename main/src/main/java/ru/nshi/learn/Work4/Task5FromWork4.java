package ru.nshi.learn.Work4;

public class Task5FromWork4 {
    public static void main(String[] args){
        Task1FromWork4 applT1W4 = new Task1FromWork4();
        Task5FromWork4 applT5W4 = new Task5FromWork4();
        char [] charArray = applT1W4.sysInStrTypeArrayChar("Введите строчку: ");
        String result = applT5W4.uniqueSymbolsInStr(charArray);
        System.out.println(result);
    }
    public String uniqueSymbolsInStr(char [] charArray){
        StringBuffer buffer = new StringBuffer();
        for (char ch: charArray){
            if (buffer.toString().contains(String.valueOf(ch)) == false){
                buffer.append(ch);
            }
        }
        String result = buffer.toString();
        return result;
    }

}