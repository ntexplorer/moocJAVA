/**
 * @Time 2020/4/27 17:27
 * @Author
 * @Project moocJAVA
 * @Class Test
 * @Software IntelliJ IDEA
 * @Version
 */

package practice1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Cat cat1 = new Cat("花花");
        Cat cat2 = new Cat("凡凡");
        Dog dog1 = new Dog("巴迪");
        Dog dog2 = new Dog("豆豆");

        AnimalPlay animalPlay = new AnimalPlay();
        List<Cat> catList = new ArrayList<>();
        catList.add(cat1);
        catList.add(cat2);
        List<Dog> dogList = new ArrayList<>();
        dogList.add(dog1);
        dogList.add(dog2);

        animalPlay.play(dogList);
        animalPlay.play(catList);
    }
}
