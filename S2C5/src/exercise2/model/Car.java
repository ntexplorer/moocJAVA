/**
 * @Time 2020/4/20 19:54
 * @Author
 * @Project moocJAVA
 * @Class Car
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise2.model;

public class Car {
    private String color;
    private String userName;

    public Car(String color, String userName) {
        this.color = color;
        this.userName = userName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void use() {
        System.out.println("我是机动车！");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return this.color.equals(car.color) && this.userName.equals(car.userName);
    }

}
