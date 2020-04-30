/**
 * @Time 2020/4/26 13:39
 * @Author
 * @Project moocJAVA
 * @Class FootballDemo
 * @Software IntelliJ IDEA
 * @Version
 */

package practice4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FootballDemo {
    public static void main(String[] args) {
        Map<Integer, String> champTeam = new HashMap<>(3);
        champTeam.put(2006, "Italy");
        champTeam.put(2014, "German");
        champTeam.put(2010, "Spain");
        for (String s : champTeam.values()) {
            System.out.println(s);
        }

        Set<Map.Entry<Integer, String>> entrySet = champTeam.entrySet();
        for (Map.Entry<Integer, String> set : entrySet) {
            System.out.println(set.getKey() + "-" + set.getValue());
        }
    }
}
