package exam2019.q3a3;

import java.util.HashMap;

/**
 * @author Tian Z
 */
public class Map {
    public static void main(String[] args) {
        HashMap<String, Integer> stuMarks = new HashMap<>(10);
        stuMarks.put("Sarah", 65);
        stuMarks.put("Peter", 25);
        stuMarks.put("Jack", 45);
        stuMarks.put("David", 85);
        for (HashMap.Entry<String, Integer> entry : stuMarks.entrySet()) {
            System.out.println(entry.getKey() + " has got " + entry.getValue() + " marks.");
        }
    }
}
