package exam2018.q1b1;

/**
 * @author Tian Z
 */
public class LargestNum {
    public static void main(String[] args) {
        double[] nums = new double[5];
        nums[0] = 5;
        nums[1] = 15;
        nums[2] = 52;
        nums[3] = 35;
        nums[4] = 3;
        double largest = 0;
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                largest = nums[i];
                index = i;
            }
        }

        System.out.println("The largest number is: " + largest);
        System.out.println("The index of the largest number is: " + index);
    }
}
