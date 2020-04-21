/**
 * @Time 2020/4/21 18:00
 * @Author
 * @Project moocJAVA
 * @Class Plane
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise3.model;

public class Plane implements IFly {
    public Plane() {
    }

    @Override
    public void fly() {
        System.out.println("飞机在天上飞");
    }
}
