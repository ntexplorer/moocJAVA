/**
 * @Time : 2020/4/18 1:02
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : CatTest2
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class CatTest2 {
    public static void main(String[] args) {
        Cat one = new Cat("Cong");
        System.out.println(one.name);
        one.run();

        Cat four = new Cat("Zai", 2, 1000, "Japanese");
        System.out.println("The name of the cat is " + four.name);
        System.out.println("The age of the cat is " + four.month);
        System.out.println("The weight of the cat is " + four.weight);
        System.out.println("The species of the cat is " + four.species);
        System.out.println("---------------------------");
    }
}
