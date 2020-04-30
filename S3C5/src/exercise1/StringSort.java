/**
 * @Time 2020/4/26 21:53
 * @Author
 * @Project moocJAVA
 * @Class StringSort
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise1;

import java.util.ArrayList;
import java.util.List;

public class StringSort {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("asdjaisod");
        strList.add("zxcj");
        strList.add("SIADJ");
        strList.add("OFEI");
        strList.add("llvj");
        System.out.println(strList);
        strList.sort(null);
        System.out.println(strList);
    }
}
