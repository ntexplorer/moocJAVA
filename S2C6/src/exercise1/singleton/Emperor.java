/**
 * @Time 2020/4/21 1:02
 * @Author
 * @Project moocJAVA
 * @Class Emperor
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise1.singleton;

public class Emperor {
    private Emperor() {

    }

    private static Emperor emperor = null;

    public static Emperor getEmperor() {
        if (emperor == null) {
            emperor = new Emperor();
        }
        return emperor;
    }
}
