/**
 * @Time : 2020/4/17 12:04
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : ArgsDemo
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class ArgsDemo {
    public void sum(int... n) {
        int sum = 0;
        for (int i : n) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        ArgsDemo ad = new ArgsDemo();
        ad.sum(1);
        ad.sum(1, 2);
        ad.sum(1, 2, 3, 4);
    }
}
