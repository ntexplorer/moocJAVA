/**
 * @Time 2020/4/22 22:08
 * @Author
 * @Project moocJAVA
 * @Class WrapTest1
 * @Software IntelliJ IDEA
 * @Version
 */

package wrap;

public class WrapTest1 {
    public static void main(String[] args) {
        int t1 = 2;
        Integer t2 = t1;

        Integer t3 = new Integer(t1);
        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println("t3 = " + t3);
        System.out.println("======================");

        int t4 = t2;
        System.out.println("t4 = " + t4);
        int t5 = t2.intValue();

        System.out.println("t5 = " + t5);

        double t6 = t2.doubleValue();
        System.out.println("t6 = " + t6);
    }
}
