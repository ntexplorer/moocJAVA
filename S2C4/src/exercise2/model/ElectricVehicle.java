/**
 * @Time 2020/4/20 13:33
 * @Author
 * @Project moocJAVA
 * @Class ElectricVehicle
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise2.model;

public class ElectricVehicle extends NonMotor {
    private String batteryBrand;

    public ElectricVehicle(String batteryBrand) {
        this.setBatteryBrand(batteryBrand);
    }

    public String getBatteryBrand() {
        return batteryBrand;
    }

    public void setBatteryBrand(String batteryBrand) {
        this.batteryBrand = batteryBrand;
    }

    @Override
    public String describeVehicle() {
        return "这是一辆使用" + this.getBatteryBrand() + "牌电池的电动车。";
    }
}
