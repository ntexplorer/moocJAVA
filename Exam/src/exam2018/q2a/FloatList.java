package exam2018.q2a;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tian Z
 */
public class FloatList {
    public static void main(String[] args) {
        List<Float> floatList = new ArrayList<>();
        float num1 = 1f;
        float num2 = 2f;
        floatList.add(num1);
        floatList.add(num2);
        for (float num : floatList) {
            System.out.println(num);
        }
    }
}
