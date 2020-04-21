/**
 * @Time 2020/4/21 18:02
 * @Author
 * @Project moocJAVA
 * @Class Test
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise3.test;

import exercise3.model.Balloon;
import exercise3.model.Bird;
import exercise3.model.Plane;

public class Test {
    public static void main(String[] args) {
        Plane obj1 = new Plane();
        Bird obj2 = new Bird();
        Balloon obj3 = new Balloon();

        obj1.fly();
        obj2.fly();
        obj3.fly();
    }
}
