/**
 * @Time : 2020/4/13 16:00
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : WhileDemo2
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class WhileDemo2 {
    public static void main(String[] args) {
        int n = 1;
        int sum = 0;
        while (n <= 100) {
            sum += n;
            n++;
        }
        System.out.println("The sum of 1-100 is: " + sum);
    }
}
