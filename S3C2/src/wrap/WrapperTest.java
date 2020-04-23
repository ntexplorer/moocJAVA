/**
 * @Time 2020/4/22 22:37
 * @Author
 * @Project moocJAVA
 * @Class WrapperTest
 * @Software IntelliJ IDEA
 * @Version
 */

package wrap;

public class WrapperTest {
    public static void main(String[] args) {
        Integer one = new Integer(100);
        Integer two = new Integer(100);
        System.out.println("one == two result is : " + (one == two));

        Integer three = 100;
        System.out.println("three == 100 result is : " + (three == 100));

        Integer four = 100;
        System.out.println("three == four result is : " + (three == four));

        Integer five = 200;
        System.out.println("five == 200 result is : " + (five == 200));

        Integer six = 200;
        System.out.println("five == six result is : " + (five == six));
    }
}
