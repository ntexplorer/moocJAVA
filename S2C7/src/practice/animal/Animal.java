/**
 * @Time 2020/4/21 1:15
 * @Author
 * @Project moocJAVA
 * @Class Animal
 * @Software IntelliJ IDEA
 * @Version
 */

package practice.animal;


/**
 * 抽象类不允许实例化，
 * 但可以通过向上转型指向子类实例
 */
public abstract class Animal {
    private String name;
    private int month;

    public Animal() {
    }

    public Animal(String name, int month) {
        this.setName(name);
        this.setMonth(month);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public abstract void eat();

    public static void say() {
        System.out.println("123");
    }
}
