/**
 * @Time 2020/4/20 13:33
 * @Author
 * @Project moocJAVA
 * @Class Bicycle
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise2.model;

public class Bicycle extends NonMotor {
    public Bicycle() {
    }

    public Bicycle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public String describeVehicle() {
        return "这是一辆" + this.getColor() + "颜色的，" + this.getBrand() + "牌的自行车";
    }
}
