import java.util.Arrays;

/**
 * @Time : 2020/4/14 10:49
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : ArrayDemo
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(arr));
        int[] arr2 = new int[5];
        arr2[2] = 55;
        System.out.println(Arrays.toString(arr2));
        String[] strArr = {"11", "aa--11", "Apple"};
        System.out.println(Arrays.toString(strArr));
        System.out.println("Length of strArr is " + strArr.length);
        System.out.println("The last element of strArr is " + strArr[strArr.length - 1]);
        int max = 5;
        for (int i = 0; i < max; i++) {
            arr2[i] = i;
            System.out.println(Arrays.toString(arr2));
        }

    }
}
