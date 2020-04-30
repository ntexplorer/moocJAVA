/**
 * @Time 2020/4/27 17:25
 * @Author
 * @Project moocJAVA
 * @Class Dog
 * @Software IntelliJ IDEA
 * @Version
 */

package practice1;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void playGame() {
        System.out.println("小狗" + this.getName() + "在做游戏！");
    }
}
