/**
 * @Time : 2020/4/17 11:48
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : ExchangeDemo
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class ExchangeDemo {
    public void swap(int a, int b) {
        int temp;
        System.out.println("Before exchange: a=" + a + " b=" + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After exchange: a=" + a + " b=" + b);
    }

    public void swapTest() {
        int m = 4, n = 5;
        System.out.println("Before exchange: m=" + m + " n=" + n);
        swap(m, n);
        System.out.println("After exchange: m=" + m + " n=" + n);
    }

    public static void main(String[] args) {
        int m = 4, n = 5;
        ExchangeDemo ed = new ExchangeDemo();
        ed.swapTest();
    }
}
