/**
 * @Time : 2020/4/17 13:23
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : ArgsDemo3
 * @Software: IntelliJ IDEA
 * @Version: 1.0
 */

public class ArgsDemo3 {
    public int plus(int a, int b) {
        System.out.println("不带可变参数的方法被调用!");
        return a + b;
    }

    public int plus(int... a) {
        int sum = 0;
        for (int n : a) {
            sum += n;
        }
        System.out.println("带可变参数的方法被调用！");
        return sum;
    }

    public static void main(String[] args) {
        ArgsDemo3 ad3 = new ArgsDemo3();
        System.out.println("Sum is " + ad3.plus(1, 2));
    }
}
