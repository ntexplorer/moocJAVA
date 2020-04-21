/**
 * @Time 2020/4/21 15:28
 * @Author
 * @Project moocJAVA
 * @Class Test
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise2.test;

import exercise2.shape.Circle;
import exercise2.shape.Rectangle;

public class Test {
    public static void main(String[] args) {
        Circle shape1 = new Circle(4);
        Rectangle shape2 = new Rectangle(15, 2);
        System.out.println("圆的面积为：" + shape1.area());
        System.out.println("矩形的面积为：" + shape2.area());
    }
}
