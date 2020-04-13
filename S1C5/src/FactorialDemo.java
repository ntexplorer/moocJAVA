/**
 * @Time : 2020/4/13 19:48
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : FactorialDemo
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class FactorialDemo {
    public static void main(String[] args) {
        int s = 1, sum = 0, num = 4;
        for (int i = 1; i <= num; i++) {
            s = 1;
            for (int j = 1; j <= i; j++) {
                s *= j;
            }
            sum = sum + s;
        }
        System.out.println("1!+2!+3!+4!=" + sum);
    }
}
