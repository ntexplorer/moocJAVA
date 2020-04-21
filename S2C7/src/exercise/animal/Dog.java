/**
 * @Time 2020/4/21 14:45
 * @Author
 * @Project moocJAVA
 * @Class Dog
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise.animal;

public class Dog extends Animal {
    public Dog(String kind) {
        super(kind);
    }

    @Override
    public void cry() {
        System.out.println("小狗的叫声：汪汪汪~~~");
    }
}
