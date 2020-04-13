/**
 * @Time : 2020/4/12 15:22
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : MathDemo1
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class MathDemo1 {
    public static void main(String[] args) {
        int x = 4;
        int y = (x++) + 5;
        System.out.println("x=" + x);
        System.out.println("y=" + y);

        int y1 = (++x) + 5;
        System.out.println("x=" + x);
        System.out.println("y1=" + y1);

        x = 4;
        int y3 = (x--) + 5;
        System.out.println("x=" + x);
        System.out.println("y3=" + y3);

        x = 4;
        int y4 = (--x) + 5;
        System.out.println("x=" + x);
        System.out.println("y4=" + y4);
    }
}
