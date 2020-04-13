/**
 * @Time : 2020/4/12 22:11
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : ConditionDemo
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class ConditionDemo {
    public static void main(String[] args) {
        int a = 4, b = 7;
        int max;
        max = a > b ? a : b;
        boolean b1 = a > b ? (3 < 6) : (true == false);
        System.out.println("b1 = " + b1);
        System.out.println("max = " + max);
    }
}
