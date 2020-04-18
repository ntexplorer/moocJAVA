package personal.cat;

/**
 * @Time : 2020/4/18 0:16
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : personal.cat.CatTest
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class CatTest {
    /**
     * Instantiation
     */
    public static void main(String[] args) {
        Cat one = new Cat();
        one.setName("Huahua");
        one.setMonth(3);
//        one.weight = 1000;
//        one.species = "British";
        System.out.println("The name of the cat is " + one.getName());
        if (one.getMonth() != 0) {
            System.out.println("The age of the cat is " + one.getMonth());
        }
//        System.out.println("The weight of the cat is " + one.weight);
//        System.out.println("The species of the cat is " + one.species);

        Cat two = new Cat("Congcong", -3, 1000, "Japanese");

    }
}
