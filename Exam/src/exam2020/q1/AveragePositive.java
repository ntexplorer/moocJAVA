package exam2020.q1;

import java.util.Scanner;

/**
 * The type Average positive.
 *
 * @author Tian Z
 */
public class AveragePositive {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
//        create a double array with the volume of 10
        double[] nums = new double[10];
        Scanner scanner = new Scanner(System.in);
//        create a double variable sum to record the sum of the numbers
        double sum = 0;
//        create a int count to count the positive number
        int count = 0;
//        use a for loop to record all the 10 double input
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Please enter the next double:");
            nums[i] = scanner.nextDouble();
        }
//        use another for loop to add numbers to sum
        for (double num : nums) {
//            check if the number is positive, if so add it to the sum and add 1 to count
            if (num > 0) {
                sum += num;
                count += 1;
            }
        }
        double average = sum / count;
        System.out.println("The average of all the positive values is " + average);
    }
}
