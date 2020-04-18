
/**
 * @Time : 2020/4/18 0:16
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : CatTest
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class CatTest {
    /**
     * Instantiation
     */
    public static void main(String[] args) {
        Cat one = new Cat();
        one.eat();
        one.run();
        one.name = "Huahua";
        one.month = 2;
        one.weight = 1000;
        one.species = "British";
        one.run(one.name);
        System.out.println("The name of the cat is " + one.name);
        System.out.println("The age of the cat is " + one.month);
        System.out.println("The weight of the cat is " + one.weight);
        System.out.println("The species of the cat is " + one.species);
        System.out.println("---------------------------");
        Cat two = new Cat();
        two.name = "Fanfan";
        two.month = 1;
        two.weight = 800;
        two.species = "Chinese";
        System.out.println("The name of the cat is " + two.name);
        System.out.println("The age of the cat is " + two.month);
        System.out.println("The weight of the cat is " + two.weight);
        System.out.println("The species of the cat is " + two.species);
        Cat three = one;
        three.name = "Guoguo";
        System.out.println("---------------------------");
        System.out.println("The name of the cat is " + three.name);
        System.out.println("The age of the cat is " + three.month);
        System.out.println("The weight of the cat is " + three.weight);
        System.out.println("The species of the cat is " + three.species);
        System.out.println("---------------------------");
        System.out.println("The name of the cat is " + one.name);

    }
}
