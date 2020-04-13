import java.util.Scanner;

/**
 * @Time : 2020/4/12 22:04
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : LogicDemo3
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class LogicDemo3 {
    public static void main(String[] args) {
        System.out.println("Please enter an integer: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (!(n % 3 == 0)) {
            System.out.println(n + " can't be divided by 3.");
        } else {
            System.out.println(n + " can be divided by 3.");
        }
    }
}
