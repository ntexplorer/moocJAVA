/**
 * @Time : 2020/4/17 12:06
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : ArgsDemo1
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class ArgsDemo1 {
    public void search(int n, int... a) {
        boolean flag = false;
        for (int a1 : a) {
            if (a1 == n) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Found! " + n);
        } else {
            System.out.println("Not found!" + n);
        }
    }

    public static void main(String[] args) {
        int m = 11;
        ArgsDemo1 ad1 = new ArgsDemo1();
        ad1.search(m, 1, 2, 3, 4, 5, 6);
        int[] a = {1, 2, 3, 11, 5, 6};
        ad1.search(m, a);
    }
}
