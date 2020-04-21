/**
 * @Time 2020/4/20 19:01
 * @Author
 * @Project moocJAVA
 * @Class Test
 * @Software IntelliJ IDEA
 * @Version
 */

package question.test;

import question.model.Animal;

public class Test {
    public static void main(String[] args) {
        Animal one = new Animal();
        one.name = "HUA";
        Animal two = new Animal();
        two.name = "FAN";
        one.help(two);
    }
}
