/**
 * @Time : 2020/4/16 15:31
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : FactorialDemo
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class FactorialDemo {
    public int getFactorial(int n) {
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac *= i;
        }
        return fac;
    }

    public int getSum(int n) {
        int sum = 0;
        FactorialDemo fac = new FactorialDemo();
        for (int i = 1; i <= n; i++) {
            sum += fac.getFactorial(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        FactorialDemo sumFac = new FactorialDemo();
        System.out.println("1!+2!+3!+4!+5!=" + sumFac.getSum(5));
    }
}
