/**
 * @Time 2020/4/21 14:46
 * @Author
 * @Project moocJAVA
 * @Class Test
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise.test;

import exercise.animal.Animal;
import exercise.animal.Cat;
import exercise.animal.Dog;
import exercise.animal.Sheep;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Animal[] animalArr = new Animal[5];
        int max = 3;
        Random random = new Random();
        for (int i = 0; i < animalArr.length; i++) {
            int a = random.nextInt(max);
            if (a == 0) {
                animalArr[i] = new Cat("cat");
            } else if (a == 1) {
                animalArr[i] = new Dog("dog");
            } else if (a == 2) {
                animalArr[i] = new Sheep("sheep");
            }
        }

        for (Animal animal : animalArr) {
            animal.cry();
        }
    }
}
