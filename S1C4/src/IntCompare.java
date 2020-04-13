import java.util.Scanner;

/**
 * @Time : 2020/4/12 23:47
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : IntCompare
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class IntCompare {
    public static void main(String[] args) {
//        int x = 5, y = 10;
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter x: ");
        int x = s.nextInt();
        System.out.println("Please enter y: ");
        int y = s.nextInt();
        if (x == y) {
            System.out.println("x = y");
        } else {
            if (x > y) {
                System.out.println("x > y");
            } else {
                System.out.println("x < y");
            }
        }
    }
}
