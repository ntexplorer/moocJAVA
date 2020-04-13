/**
 * @Time : 2020/4/12 23:43
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : FlowPrac1
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class FlowPrac1 {
    public static void main(String[] args) {
        int x = -5;
        int y = 0;
        if (x < 0) {
            y = -1;
        } else if (x == 0) {
            y = 0;
        } else {
            y = 1;
        }
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}
