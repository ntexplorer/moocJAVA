/**
 * @Time 2020/4/19 22:38
 * @Author
 * @Project moocJAVA
 * @Class Test
 * @Software IntelliJ IDEA
 * @Version
 */

package practice.test;

import practice.animal.Cat;
import practice.animal.Dog;

public class Test {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Huahua");
        cat1.setSpecies("Lonely Cat");
//        cat1.month
        cat1.eat();
        cat1.run();
        System.out.println("==========================");
        Dog dog1 = new Dog();
        dog1.setName("Niuniu");
        dog1.setMonth(1);
        dog1.eat();
        dog1.sleep();
        System.out.println(dog1.getMonth());
        System.out.println("==========================");
        dog1.eat("Fanfan");
        System.out.println("==========================");
        System.out.println(cat1.temp);
//        Animal animal1 = new Animal();
//        animal1.sleep();
//        animal1.run();
    }
}
