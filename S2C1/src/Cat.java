/**
 * @Time : 2020/4/18 0:12
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : Cat
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class Cat {
    //    Attributes: nickname, age, weight, species
    String name;
    int month;
    double weight;
    String species;

    public Cat() {
        System.out.println("我是构造无参数方法");
    }

    public Cat(String name) {
        System.out.println("我是构造带参数方法");
    }

    public Cat(String name, int month, double weight, String species) {
//      Call to this must be the first statement in the constructor body
        this(" ");
        this.name = name;
        this.month = month;
        this.weight = weight;
        this.species = species;
    }

    //    Method: run, eat
    public void run() {
        System.out.println("The cat runs!");
    }

    public void run(String name) {
        System.out.println("The cat named " + name + " is running!");
    }

    public void eat() {
        System.out.println("The cat eats!");
    }
}
