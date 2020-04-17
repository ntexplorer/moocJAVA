import java.util.Scanner;

/**
 * @Time : 2020/4/14 11:22
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : ArrayPractice1
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class ArrayPractice1 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a number: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements that could be divided by 3 are: ");
        for (int value : arr) {
            if (value % 3 == 0) {
                System.out.println(value);
            }
        }
    }
}
