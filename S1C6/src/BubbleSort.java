import java.util.Arrays;
import java.util.Scanner;

/**
 * @Time : 2020/4/14 11:38
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : BubbleSort
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] intArray = new int[6];
        Scanner key = new Scanner(System.in);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Please enter a number: ");
            intArray[i] = key.nextInt();
        }
        System.out.println("The original array is " + Arrays.toString(intArray));
        int temp;
        int j = intArray.length - 1;
        while (j > 0) {
            for (int i = 0; i < intArray.length - 1; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    temp = intArray[i + 1];
                    intArray[i + 1] = intArray[i];
                    intArray[i] = temp;
                }
            }
            System.out.println(Arrays.toString(intArray));
            j--;
        }
        System.out.println("The sorted array is " + Arrays.toString(intArray));
    }
}
