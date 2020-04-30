/**
 * @Time 2020/4/27 10:47
 * @Author
 * @Project moocJAVA
 * @Class NameComparator
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise2;

import java.util.Comparator;

public class NameComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        String name1 = o1.getName();
        String name2 = o2.getName();
        return name1.compareTo(name2);
//        return name2.compareTo(name1);
//        reversed
    }
}
