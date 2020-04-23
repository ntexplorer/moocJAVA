/**
 * @Time 2020/4/22 22:21
 * @Author
 * @Project moocJAVA
 * @Class WrapTest2
 * @Software IntelliJ IDEA
 * @Version
 */

package wrap;

public class WrapTest2 {
    public static void main(String[] args) {
        int t1 = 2;
        String t2 = Integer.toString(t1);
        System.out.println("t1 to t2 : " + t2);
        System.out.println("=========================");

        int t3 = Integer.parseInt(t2);
        System.out.println("t2 to t3 : " + t3);
        int t4 = Integer.valueOf(t2);
    }
}
