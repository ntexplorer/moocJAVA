/**
 * @Time : 2020/4/17 11:43
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : AreaDemo
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class AreaDemo {
    public double getArea(double length, double width) {
        return length * width;
    }

    public double getArea(double r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        AreaDemo ad = new AreaDemo();
        double length = 8, width = 5;
        double r = 4.5;
        double areaC = ad.getArea(length, width);
        double areaY = ad.getArea(r);
        System.out.println("圆的面积为：" + areaY);
        System.out.println("长方形面积为：" + areaC);
    }
}
