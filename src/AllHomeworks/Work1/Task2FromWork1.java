package AllHomeworks.Work1;
import static AllHomeworks.Work1.Task1FromWork1.isLuckyNumber;
public class Task2FromWork1 {
    public static void main(String[] args) {
        Task2FromWork1 application = new Task2FromWork1();
        int sum = application.summElements();
        System.out.println(sum);
    }
    public int summElements() {
        int sum = 0;
        for(int num = 100000; num<=999999; num++) {
            boolean flag = isLuckyNumber(num);
            if (flag) {
                sum += num;
            }
        }
        return sum;
    }
}
