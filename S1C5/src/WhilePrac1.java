/**
 * @Time : 2020/4/13 16:18
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : WhilePrac1
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class WhilePrac1 {
    public static void main(String[] args) {
        int n = 1;
        int sum = 0;
        while (n < 6) {
            sum += n * n;
            n++;
        }
        System.out.println("1到5的平方和为: " + sum);
    }
}
