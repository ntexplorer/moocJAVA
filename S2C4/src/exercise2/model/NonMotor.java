/**
 * @Time 2020/4/20 13:31
 * @Author
 * @Project moocJAVA
 * @Class NonMotor
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise2.model;

public class NonMotor {
    private String brand;
    private String color;
    private int wheelCount = 2;
    private int seatCount = 1;

    public NonMotor() {
    }

    public NonMotor(String brand, String color) {
        this.setBrand(brand);
        this.setColor(color);
    }

    public NonMotor(String brand, String color, int wheelCount, int seatCount) {
        this.setBrand(brand);
        this.setColor(color);
        this.setWheelCount(wheelCount);
        this.setSeatCount(seatCount);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public String describeVehicle() {
        return "这是一辆" + this.getColor() + "颜色的，" + this.getBrand() + "牌的非机动车，有" + this.getWheelCount() + "个轮子，有"
                + this.getSeatCount() + "个座椅的非机动车";
    }
}
