import java.util.Scanner;

/**
 * @Time : 2020/4/12 21:29
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : ConditionDemo2
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class ConditionDemo2 {
    public static void main(String[] args) {
//        int n = 10;
//        take parameter from keyboard
        System.out.println("Please enter an integer: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n % 2 == 0) {
            System.out.println("n为偶数");
        } else {
            System.out.println("n为奇数");
        }
//        practice
        int x = -2, y = 0;
        if (x > 0) {
            y = 2 * x + 1;
        } else {
            y = x + 5;
        }
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}
