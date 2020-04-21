/**
 * @Time 2020/4/20 20:05
 * @Author
 * @Project moocJAVA
 * @Class Test
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise2.test;

import exercise2.model.Car;
import exercise2.model.HomeCar;
import exercise2.model.Taxi;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car("red", "David");
        Car car2 = new Car("red", "David");

        car1.use();
        System.out.println("car1和car2的引用比较：" + car1.equals(car2));
        System.out.println("=====================");
        Taxi taxi1 = new Taxi("蓝", "张小泉", "天宇");
        HomeCar homeCar1 = new HomeCar("紫", "孙二娘", 7);
        taxi1.ride();
        taxi1.use();
        System.out.println(taxi1.toString());
        System.out.println("=====================");
        homeCar1.display();
        homeCar1.display(5);
    }

}
