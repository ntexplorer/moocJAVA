import java.util.Scanner;

/**
 * @Time : 2020/4/12 23:13
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : ConditionPrac2
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class ConditionPrac2 {
    public static void main(String[] args) {
        System.out.println("Please enter a integer: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if ((n % 5 == 0) && (n % 7 == 0)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
