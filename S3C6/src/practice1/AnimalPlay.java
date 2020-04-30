/**
 * @Time 2020/4/27 17:26
 * @Author
 * @Project moocJAVA
 * @Class AnimalPlay
 * @Software IntelliJ IDEA
 * @Version
 */

package practice1;

import java.util.List;

public class AnimalPlay {
    public void play(List<? extends Animal> animals) {
        for (Animal a : animals) {
            a.playGame();
        }
    }
}
