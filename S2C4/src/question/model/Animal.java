/**
 * @Time 2020/4/20 18:59
 * @Author
 * @Project moocJAVA
 * @Class Animal
 * @Software IntelliJ IDEA
 * @Version
 */

package question.model;

public class Animal {
    public String name;
    public int month;

    public Animal() {
    }

    public void eat() {
        System.out.println(this.name + " is eating.");
    }

    public void help(final Animal temp) {
//        temp = new Animal();
        temp.name = "Niu";
        temp.eat();
    }
}
