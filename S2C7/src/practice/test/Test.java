/**
 * @Time 2020/4/21 1:24
 * @Author
 * @Project moocJAVA
 * @Class Test
 * @Software IntelliJ IDEA
 * @Version
 */

package practice.test;

import practice.animal.Animal;
import practice.animal.Cat;
import practice.animal.Dog;

public class Test {
    public static void main(String[] args) {
//        Animal one = new Animal();
        /* 向上转型——父类引用指向子类实例
         * 可以调用子类重写父类的方法以及父类派生的方法
         * 子类特有的方法无法调用
         * 父类静态方法无法被子类重写
         * */
        Animal two = new Cat();
        Animal three = new Dog();

//        one.eat();
        two.eat();
        two.setMonth(2);
        System.out.println(two.getMonth());


        three.eat();
        System.out.println("=======================");
        /*
         * 向下转型、强制类型转换
         * 子类引用指向父类对象，必须进行强转，可以调用子类特有的方法
         * 必须满足转换条件
         * */
        if (two instanceof Cat) {
            Cat temp = (Cat) two;
            temp.eat();
            temp.run();
            System.out.println(temp.getMonth());
            System.out.println("two可以转换为cat类型");
        }


        System.out.println("=================");
        if (two instanceof Dog) {
            Dog temp2 = (Dog) two;
            temp2.eat();
            temp2.sleep();
            temp2.getSex();
            System.out.println("two可以转换为dog类型");
        }

        if (two instanceof Animal) {
            System.out.println("two可以转换为Animal");
        }

        if (two instanceof Object) {
            System.out.println("two可以转换为Object");
        }

        Animal.say();
    }
}
