import java.util.Arrays;
import java.util.Scanner;

/**
 * @Time : 2020/4/14 11:07
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : ArrayDemo2
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner key = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Please enter a number: ");
            a[i] = key.nextInt();
        }
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        System.out.println("The array entered is " + Arrays.toString(a));
        System.out.println("The sum of the array is " + sum);
    }
}
