/**
 * @Time 2020/4/27 10:51
 * @Author
 * @Project moocJAVA
 * @Class CatTest
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatTest {
    public static void main(String[] args) {
        Cat hua = new Cat("Hua", 12, "British");
        Cat fan = new Cat("Fan", 3, "Chinese");
        Cat mao = new Cat("Mao", 2, "Japanese");

        List<Cat> catList = new ArrayList<>();
        catList.add(hua);
        catList.add(fan);
        catList.add(mao);
        System.out.println("before sort:");
        for (Cat cat : catList) {
            System.out.println(cat);
        }

        Collections.sort(catList, new NameComparator());
        System.out.println("after sort by name:");
        for (Cat cat : catList) {
            System.out.println(cat);
        }


        catList.sort(new AgeComparator());
        System.out.println("after sort by age: ");
        for (Cat cat : catList) {
            System.out.println(cat);
        }
    }
}
