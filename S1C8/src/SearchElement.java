import java.util.Scanner;

/**
 * @Time : 2020/4/17 11:18
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : SearchElement
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class SearchElement {
    public boolean search(int n, int[] arr) {
        boolean result = false;
        for (int value : arr) {
            if (value == n) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter a integer: ");
            System.out.println("(Enter 0 to exit)");
            int n = s.nextInt();
            if (n == 0) {
                System.out.println("Test terminated.");
                break;
            } else {
                SearchElement se = new SearchElement();
                System.out.println(se.search(n, arr1));
            }
        }
    }
}
