/**
 * @Time 2020/4/22 16:52
 * @Author
 * @Project moocJAVA
 * @Class TryDemo5
 * @Software IntelliJ IDEA
 * @Version
 */

package practice.test;

public class TryDemo5 {
    public static void main(String[] args) {
        try {
            testThree();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testOne() throws HotelAgeException {
        throw new HotelAgeException();
    }

    public static void testTwo() throws Exception {
        try {
            testOne();
        } catch (HotelAgeException e) {
            throw new Exception("I am new exception 1.", e);
        }
    }

    public static void testThree() throws Exception {
        try {
            testTwo();
        } catch (Exception e) {
            throw new Exception("I am new exception 2.", e);
//            throw new Exception("I am new exception 2.", e);
        }
    }
}
