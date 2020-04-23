/**
 * @Time 2020/4/22 15:07
 * @Author
 * @Project moocJAVA
 * @Class TryDemo1
 * @Software IntelliJ IDEA
 * @Version
 */

package practice.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemo1 {
    public static void main(String[] args) {
//        int one = 12;
//        int two = 2;
//        System.out.println("one divide two is " + (one / two));

        int a, b;
        Scanner key = new Scanner(System.in);
        try {
            System.out.print("Please enter the first integer: ");
            a = key.nextInt();
            System.out.println();
            System.out.print("Please enter the second integer: ");
            b = key.nextInt();
            System.out.println("one divide two is " + (a / b));
        }
//         catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("Shit happens!");
//        }

        catch (ArithmeticException e) {
            System.out.println("Can't divide 0");
            System.exit(1); // terminated program
        } catch (InputMismatchException e) {
            System.out.println("Can't be String");
        } catch (Exception e) {
            System.out.println("Catch any other exceptions");
        } finally {
            System.out.println("Calculation finished.");
        }

    }
}
