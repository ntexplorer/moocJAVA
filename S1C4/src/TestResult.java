import java.util.Scanner;

/**
 * @Time : 2020/4/12 23:27
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : TestResult
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class TestResult {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your score: ");
        int score = s.nextInt();
        if (score >= 70) {
            System.out.println("Distinction");
        } else if (score >= 60) {
            System.out.println("Merit");
        } else if (score >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
