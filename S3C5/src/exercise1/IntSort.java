/**
 * @Time 2020/4/26 21:49
 * @Author
 * @Project moocJAVA
 * @Class IntSort
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise1;

import java.util.ArrayList;
import java.util.List;

public class IntSort {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();
        arrList.add(55);
        arrList.add(23);
        arrList.add(774);
        arrList.add(12);
        arrList.add(80);
        arrList.add(585);
        System.out.println(arrList);
        arrList.sort(null);
        System.out.println(arrList);
    }
}
