import java.util.Arrays;

/**
 * @Time : 2020/4/14 14:03
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : ArrayDemo2
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[][] num = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5, 6, 7, 8}};
        System.out.println(Arrays.deepToString(num));
        System.out.println(num.length);
        System.out.println(num[2].length);
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j]);
            }
            System.out.println();
        }
    }
}
