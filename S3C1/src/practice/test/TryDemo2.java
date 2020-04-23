/**
 * @Time 2020/4/22 15:30
 * @Author
 * @Project moocJAVA
 * @Class TryDemo2
 * @Software IntelliJ IDEA
 * @Version
 */

package practice.test;

import java.util.Scanner;

public class TryDemo2 {
    public static void main(String[] args) {
        int result = test();
        System.out.println("The result is: " + result);
    }

    public static int test() {
        int a, b;
        Scanner key = new Scanner(System.in);
        try {
            System.out.print("Please enter the first integer: ");
            a = key.nextInt();
            System.out.println();
            System.out.print("Please enter the second integer: ");
            b = key.nextInt();
            System.out.println("one divide two is " + (a / b));
            return a / b;
        }
//         catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("Shit happens!");
//        }

        catch (ArithmeticException e) {
            System.out.println("Can't divide 0");
            return 0;
        } finally {
            System.out.println("Calculation finished.");
//            return -1000000;
        }
    }
}
