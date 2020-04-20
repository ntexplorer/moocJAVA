/**
 * @Time 2020/4/20 13:31
 * @Author
 * @Project moocJAVA
 * @Class Test
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise2.test;

import exercise2.model.Bicycle;
import exercise2.model.ElectricVehicle;
import exercise2.model.NonMotor;
import exercise2.model.Tricycle;

public class Test {
    public static void main(String[] args) {
        NonMotor motor1 = new NonMotor("天宇", "红");
        Bicycle motor2 = new Bicycle("捷安特", "黄");
        ElectricVehicle motor3 = new ElectricVehicle("飞鸽");
        Tricycle motor4 = new Tricycle();

        System.out.print("父类信息测试：");
        System.out.println(motor1.describeVehicle());
        System.out.print("自行车类信息测试：");
        System.out.println(motor2.describeVehicle());
        System.out.print("电动车类信息测试：");
        System.out.println(motor3.describeVehicle());
        System.out.print("三轮车类信息测试：");
        System.out.println(motor4.describeVehicle());
    }
}
