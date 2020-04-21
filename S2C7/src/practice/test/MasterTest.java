/**
 * @Time 2020/4/21 14:25
 * @Author
 * @Project moocJAVA
 * @Class MasterTest
 * @Software IntelliJ IDEA
 * @Version
 */

package practice.test;

import practice.animal.Animal;
import practice.animal.Cat;
import practice.animal.Dog;
import practice.animal.Master;

public class MasterTest {
    public static void main(String[] args) {

        Master master = new Master();
        Cat one = new Cat();
        Dog two = new Dog();

        master.feed(one);
        master.feed(two);

        System.out.println("==================");
        boolean isManyTime = true;
        Animal temp;
        if (isManyTime) {
            temp = master.hasManyTime();
        } else {
            temp = master.hasLittleTime();
        }
        System.out.println(temp);

        master.raise(isManyTime);
    }
}
