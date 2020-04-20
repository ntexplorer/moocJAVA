/**
 * @Time 2020/4/20 13:33
 * @Author
 * @Project moocJAVA
 * @Class Tricycle
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise2.model;

public class Tricycle extends NonMotor {
    public Tricycle() {
        this.setWheelCount(3);
    }

    @Override
    public String describeVehicle() {
        return "三轮车是一款有" + this.getWheelCount() + "个轮子的非机动车。";
    }

}
