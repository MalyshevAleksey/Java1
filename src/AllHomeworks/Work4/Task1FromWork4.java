package AllHomeworks.Work4;
import java.util.Scanner;
public class Task1FromWork4 {
    public static void main(String args[]) {
        char [] charArray = sysInStrTypeArrayChar("Введите строчку: ");
        String out = "";
        for (int i = 0; i < charArray.length; i++) {
            out = sysOutChars(charArray, i);
            System.out.println(out);
        }
    }
    public static char[] sysInStrTypeArrayChar(String outScreen) {
        System.out.print(outScreen);
        Scanner in = new Scanner(System.in);
        char [] string = in.next().toCharArray();
        return string;
    }
    public static String sysOutChars(char [] ch, int i) {
        boolean flag = true;
        String buff = "";
        for (int j = 0; j <= i; j++) {
            buff += ch[j];
        }
        return buff;
    }
}