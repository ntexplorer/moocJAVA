/**
 * @Time : 2020/4/13 16:22
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : DoWhileDemo1
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class DoWhileDemo1 {
    public static void main(String[] args) {
        int n = 1;
        int sum = 0;
        do {
            sum += n;
            n++;
        } while (n <= 5);
        System.out.println("Sum of 1-5: " + sum);
    }
}
