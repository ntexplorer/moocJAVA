/**
 * @Time 2020/4/21 18:01
 * @Author
 * @Project moocJAVA
 * @Class Balloon
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise3.model;

public class Balloon implements IFly {
    public Balloon() {
    }

    @Override
    public void fly() {
        System.out.println("气球飞上天空");
    }
}
