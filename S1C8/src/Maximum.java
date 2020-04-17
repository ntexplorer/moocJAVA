/**
 * @Time : 2020/4/16 15:16
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : Maximum
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class Maximum {
    public void getMax(float a, float b) {
        float max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        System.out.println("The bigger number is " + max);
    }

    public static void main(String[] args) {
        Maximum mx = new Maximum();
        mx.getMax(5.6f, 10.4f);
    }
}
