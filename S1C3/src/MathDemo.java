/**
 * @Time : 2020/4/9 13:44
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : MathDemo
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class MathDemo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int result1, result2, result3, result4;
        result1 = num1 + num2;
        result2 = num1 - num2;
        result3 = num1 * num2;
        result4 = num1 / num2;
        int result5 = num1 % num2;
        System.out.println(num1 + "+" + num2 + "=" + result1);
        System.out.println(num1 + "-" + num2 + "=" + result2);
        System.out.println(num1 + "*" + num2 + "=" + result3);
        System.out.println(num1 + "/" + num2 + "=" + result4);
        System.out.println(num1 + "%" + num2 + "=" + result5);
        System.out.println("13.5%5=" + (13.5 % 5));

//        practice
        int m = 10, n = 5;
        m += 3;
        n += 5;
        int p = (m + n) / 2;
        int q = m * m * n * n;
        System.out.println(p);
        System.out.println(q);
//      practice 2
//        int a, b, c;
//        a = 4;
//        b = 15;
//        c = 20;
//        int m = (b / a) + c;
//        int n = (c % b) * a - c;
//        System.out.println(m);
//        System.out.println(n);

    }
}
