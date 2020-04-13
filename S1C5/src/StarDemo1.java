/**
 * @Time : 2020/4/13 19:38
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : StarDemo1
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class StarDemo1 {
    public static void main(String[] args) {
        int m = 1;
        int n;
        int max = 10;
        System.out.println("Print asters with 10 rows and 10 lines.");
        while (m <= max) {
            n = 1;
            while (n <= m) {
                System.out.print("* ");
                n++;
            }
//            if (n == (max + 1)) {
//                n = 1;
//            }
            System.out.println();
            m++;
        }
    }
}
