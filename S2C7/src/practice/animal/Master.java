/**
 * @Time 2020/4/21 14:21
 * @Author
 * @Project moocJAVA
 * @Class Master
 * @Software IntelliJ IDEA
 * @Version
 */

package practice.animal;

import org.jetbrains.annotations.NotNull;

public class Master {
    public void feed(@NotNull Cat cat) {
        cat.eat();
        cat.playBall();

    }

    public void feed(@NotNull Dog dog) {
        dog.eat();
        dog.sleep();
    }

    public void feed(Animal obj) {
        if (obj instanceof Cat) {
            Cat temp = (Cat) obj;
            temp.eat();
            temp.playBall();
        } else if (obj instanceof Dog) {
            Dog temp = (Dog) obj;
            temp.eat();
            temp.sleep();
        }
    }

    public Dog hasManyTime() {
        System.out.println("主人时间充足，适合养狗");
        return new Dog();
    }

    public Cat hasLittleTime() {
        System.out.println("主人时间不多，适合养猫");
        return new Cat();
    }

    public Animal raise(boolean isManyTime) {
        if (isManyTime) {
            System.out.println("主人时间充足，适合养狗");
            return new Dog();
        } else {
            System.out.println("主人时间不多，适合养猫");
            return new Cat();
        }
    }
}
