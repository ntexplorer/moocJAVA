/**
 * @Time 2020/4/27 10:56
 * @Author
 * @Project moocJAVA
 * @Class AgeComparator
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise2;

import java.util.Comparator;

public class AgeComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        int age1 = o1.getMonth();
        int age2 = o2.getMonth();
        return (age2 - age1);
    }

}
