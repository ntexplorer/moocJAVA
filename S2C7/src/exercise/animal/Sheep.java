/**
 * @Time 2020/4/21 14:45
 * @Author
 * @Project moocJAVA
 * @Class Sheep
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise.animal;

public class Sheep extends Animal {
    public Sheep(String kind) {
        super(kind);
    }

    @Override
    public void cry() {
        System.out.println("小羊的叫声：咩咩咩~~");
    }
}
