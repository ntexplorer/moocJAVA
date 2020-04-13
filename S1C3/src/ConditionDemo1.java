/**
 * @Time : 2020/4/12 16:13
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : ConditionDemo1
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class ConditionDemo1 {
    public static void main(String[] args) {
        double price1, price2;
        price1 = 80;
        price2 = 55;
        double sum = price1 + price2;
        if (sum > 100) {
            System.out.println("sum = " + sum);
            sum -= 20;
            System.out.println("newSum = " + sum);
        } else {
            System.out.println("sum" + sum);
        }
    }
}
