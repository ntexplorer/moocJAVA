/**
 * @Time 2020/4/21 1:20
 * @Author
 * @Project moocJAVA
 * @Class Cat
 * @Software IntelliJ IDEA
 * @Version
 */

package practice.animal;

public class Cat extends Animal {
    private double weight;

    public Cat() {
    }

    public Cat(String name, int month, double weight) {
        super(name, month);
        this.setWeight(weight);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void run() {
        System.out.println("小猫快乐的奔跑");
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼~");
    }

    public static void say() {
        System.out.println("345");
    }

    public void playBall() {
        System.out.println("猫喜欢吉良吉影");
    }
}
