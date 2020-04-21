/**
 * @Time 2020/4/21 0:53
 * @Author
 * @Project moocJAVA
 * @Class Earth
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise1.singleton;

public class Earth {
    private Earth() {
        System.out.println("地球诞生");
    }

    private static final Earth earth = new Earth();

    public static Earth getEarth() {
        return earth;
    }
}
