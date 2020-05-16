package exam2019.q3a1;

/**
 * @author Tian Z
 */
public class Minimum {
    public static void main(String[] args) {
        int[] intArray = {109, 22, 31, 14, 25, 76, 27, 18, 39};
        int minimum = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] < intArray[i - 1]) {
                minimum = intArray[i];
            }
        }
        System.out.println(minimum);
    }
}
