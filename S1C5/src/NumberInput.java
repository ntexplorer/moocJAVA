import java.util.Scanner;

/**
 * @Time : 2020/4/13 19:23
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : NumberInput
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class NumberInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            System.out.println("Input a number: ");
            n = sc.nextInt();
            if (n == 10) {
                System.out.println("Stop!");
                break;
            } else {
                System.out.println(n);
            }
        }
    }
}
