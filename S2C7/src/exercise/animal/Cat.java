/**
 * @Time 2020/4/21 14:44
 * @Author
 * @Project moocJAVA
 * @Class Cat
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise.animal;

public class Cat extends Animal {
    public Cat(String kind) {
        super(kind);
    }

    @Override
    public void cry() {
        System.out.println("小猫的叫声：喵喵喵~~~");
    }
}
