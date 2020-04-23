

package practice.test;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The type Try demo 3.
 *
 * @author ntexp
 */
public class TryDemo3 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

/*        try {
            int result = test();
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide 0");
        } catch (InputMismatchException e) {
            System.out.println("Can't use String");
        }*/

        try {
            int result = test();
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("1");
        } catch (InputMismatchException e) {
            System.out.println("2");
        } catch (Exception e) {
            System.out.println("3");
        }

    }

    /**
     * Test int.
     *
     * @return the int
     * @throws ArithmeticException    the arithmetic exception
     * @throws InputMismatchException the input mismatch exception
     */
    public static int test() throws ArithmeticException, InputMismatchException {
        int a, b;
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter the first integer: ");
        a = key.nextInt();
        System.out.print("Please enter the second integer: ");
        b = key.nextInt();
        System.out.println("Calculation finished.");
        return a / b;
    }

/*    public static int test() throws Exception {
        int a, b;
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter the first integer: ");
        a = key.nextInt();
        System.out.print("Please enter the second integer: ");
        b = key.nextInt();
        System.out.println("Calculation finished.");
        return a / b;
    }*/
}
