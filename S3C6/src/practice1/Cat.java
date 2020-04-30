/**
 * @Time 2020/4/27 17:26
 * @Author
 * @Project moocJAVA
 * @Class Cat
 * @Software IntelliJ IDEA
 * @Version
 */

package practice1;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void playGame() {
        System.out.println("小猫" + this.getName() + "在做游戏！");
    }
}
