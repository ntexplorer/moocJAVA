/**
 * @Time : 2020/4/16 15:11
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : Rectangle
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class Rectangle {
    public int getArea() {
        int length = 10;
        int width = 5;
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rc = new Rectangle();
        int area = rc.getArea();
        System.out.println("Area of the rectangle is " + area);
    }
}
