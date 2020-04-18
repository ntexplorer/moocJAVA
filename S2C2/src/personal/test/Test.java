/**
 * @Time : 2020/4/18 21:23
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : Test
 * @Software: IntelliJ IDEA
 * @Version:
 */

package personal.test;

import personal.cat.Cat;

public class Test {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("花花");
        cat1.setMonth(2);
        cat1.setSpecies("英国短毛猫");
        Cat.price = 2000;
//        静态访问方法:1 对象名（不推荐） 2 类名
        Cat.price = 3000;

        Cat cat2 = new Cat();
        cat2.setName("凡凡");
        cat2.setMonth(1);
        cat2.setSpecies("中华田园猫");
//        cat2.price = 150;

        System.out.println(cat1.getName() + "的售价" + Cat.price);
        System.out.println(cat2.getName() + "的售价" + Cat.price);

        cat1.run("ZZ");
        System.out.println(Cat.price);
//        Cat.eat();
//        不推荐
//        cat1.eat();
    }
}
