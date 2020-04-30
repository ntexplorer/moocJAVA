/**
 * @Time 2020/4/26 11:15
 * @Author
 * @Project moocJAVA
 * @Class CatTest
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise2.test;

import exercise2.model.Cat;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CatTest {
    public static void main(String[] args) {
        Cat hua = new Cat("Hua", 12, "British Short");
        Cat fan = new Cat("Fan", 3, "Chinese Urban");

        Set<Cat> catSet = new HashSet<>();
        catSet.add(hua);
        catSet.add(fan);

        Iterator<Cat> it = catSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        Cat hua2 = new Cat("Hua", 12, "British Short");
        catSet.add(hua2);
        System.out.println("****************");
        it = catSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Cat hua3 = new Cat("Hua2", 2, "British Short");
        catSet.add(hua3);
        System.out.println("**********************");
        it = catSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("**********************");
        if (catSet.contains(hua)) {
            System.out.println("Found!");
            System.out.println(hua);
        } else {
            System.out.println("Not found!");
        }

        System.out.println("*******************");
        boolean flag = false;
        Cat c = null;
        it = catSet.iterator();
        while (it.hasNext()) {
            c = it.next();
            if ("Hua".equals(c.getName())) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Found!");
            System.out.println(c);
        } else {
            System.out.println("Not found!");
        }

        /* catSet.removeIf(cat -> "Hua2".equals(cat.getName())); */
        /* System.out.println("After deleting Hua2"); */

        Set<Cat> set1 = new HashSet<>();
        for (Cat cat : catSet) {
            if (cat.getMonth() < 5) {
                set1.add(cat);
            }
        }
        catSet.removeAll(set1);


        for (Cat cat : catSet) {
            System.out.println(cat);
        }

        boolean flag1 = catSet.removeAll(catSet);
        if (catSet.isEmpty()) {
            System.out.println("CatSet has been cleared!");
        } else {
            System.out.println("CatSet is not empty!");
        }

        if (flag1) {
            System.out.println("CatSet has been cleared!");
        } else {
            System.out.println("CatSet is not empty!");
        }
    }
}
