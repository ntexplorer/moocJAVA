/**
 * @Time 2020/4/26 11:04
 * @Author
 * @Project moocJAVA
 * @Class HashSetDemo1
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("blue");
        set.add("red");
        set.add("black");
        set.add("yellow");
        set.add("white");
        System.out.println("集合中的元素为:");
        Iterator<String> setIterator = set.iterator();
        while (setIterator.hasNext()) {
            System.out.print(setIterator.next() + "  ");
        }

//        set.add("green");

    }
}
