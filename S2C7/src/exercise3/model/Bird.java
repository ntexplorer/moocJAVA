/**
 * @Time 2020/4/21 18:01
 * @Author
 * @Project moocJAVA
 * @Class Bird
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise3.model;

public class Bird implements IFly {
    public Bird() {
    }

    @Override
    public void fly() {
        System.out.println("小鸟在天空翱翔");
    }
}
