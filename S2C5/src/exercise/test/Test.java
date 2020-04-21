/**
 * @Time 2020/4/20 19:38
 * @Author
 * @Project moocJAVA
 * @Class Test
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise.test;

import exercise.model.Banana;
import exercise.model.Fruits;
import exercise.model.Waxberry;

public class Test {
    public static void main(String[] args) {
        Fruits fru1 = new Fruits("圆", "酸甜");
        Fruits fru2 = new Fruits("圆", "酸甜");
        fru1.eat();
        System.out.println("fru1和fru2的引用比较：" + fru1.equals(fru2));
        System.out.println("=============================");
        Waxberry wax = new Waxberry("圆形", "酸甜适中", "紫红色");
        wax.face();
        wax.eat();
        System.out.println(wax.toString());
        System.out.println("=============================");
        Banana banana = new Banana("短而稍圆", "香甜", "仙人蕉");
        banana.advantage();
        banana.advantage("黄色");
    }
}
