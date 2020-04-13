import java.util.Scanner;

/**
 * @Time : 2020/4/13 18:57
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : DoWhileDemo2
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class DoWhileDemo2 {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 10 + 1);
//        Math.random provide a random figure between 0,1
        int guess;
        do {
            System.out.println("Please enter a number: ");
            Scanner key = new Scanner(System.in);
            guess = key.nextInt();
            if (guess > num) {
                System.out.println("Too big.");
            } else if (guess < num) {
                System.out.println("Too small.");
            }
        } while (guess != num);
        System.out.println("Congratulation! The number is " + num);
    }
}
