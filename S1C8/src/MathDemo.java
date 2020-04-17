/**
 * @Time : 2020/4/17 11:37
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : MathDemo
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class MathDemo {
    public int plus(int m, int n) {
        return m + n;
    }

    public double plus(double m, double n) {
        return m + n;
    }

    public int plus(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    public static void main(String[] args) {
        MathDemo md = new MathDemo();
        int m = 5, n = 10;
        int[] arr = {1, 2, 3, 4, 5, 6};
        double a = 1.544123, b = 23.434321;
        System.out.println(md.plus(arr));
        System.out.println(md.plus(m, n));
        System.out.println(md.plus(a, b));

    }
}
