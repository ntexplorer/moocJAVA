/**
 * @Time 2020/4/21 1:04
 * @Author
 * @Project moocJAVA
 * @Class Test2
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise1.test;

import exercise1.singleton.Emperor;

public class Test2 {
    public static void main(String[] args) {

        System.out.println("创建1号皇帝对象");
        System.out.println(Emperor.getEmperor());
        System.out.println("创建2号皇帝对象");
        System.out.println(Emperor.getEmperor());
        System.out.println("创建3号皇帝对象");
        System.out.println(Emperor.getEmperor());
        System.out.println("三个皇帝对象依次是：");
    }
}

