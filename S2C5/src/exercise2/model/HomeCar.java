/**
 * @Time 2020/4/20 20:02
 * @Author
 * @Project moocJAVA
 * @Class HomeCar
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise2.model;

public final class HomeCar extends Car {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public HomeCar(String color, String userName, int num) {
        super(color, userName);
        this.num = num;
    }

    public void display() {
        System.out.println(this.getUserName() + "拥有的" + this.getColor() + "颜色的私家车有" + this.num + "个座位。");
    }

    public void display(int num) {
        System.out.println("家用汽车大多有" + num + "个座位。");
    }
}
