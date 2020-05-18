package exam2020.q1;

import java.util.Scanner;

/**
 * The type Positive int.
 *
 * @author Tian Z
 */
public class PositiveInt {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
//        Initialize val
        int val;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please enter a String:");
            String input = scanner.nextLine();
            if (isNumeric(input)) {
                val = Integer.parseInt(input);
                System.out.println("The value of val is: " + val);
                break;
            }
        } while (true);

    }

    /**
     * Create a method to check if the String entered could be transformed to a positive integer
     *
     * @param string the string
     * @return return true if the string could be transformed to a positive integer
     */
    public static boolean isNumeric(String string) {
        for (int i = string.length(); --i >= 0; ) {
            if (!Character.isDigit(string.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
