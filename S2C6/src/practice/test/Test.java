/**
 * @Time 2020/4/21 0:48
 * @Author
 * @Project moocJAVA
 * @Class Test
 * @Software IntelliJ IDEA
 * @Version
 */

package practice.test;

import practice.singleton.SingletonOne;
import practice.singleton.SingletonTwo;

public class Test {
    public static void main(String[] args) {
        SingletonOne one = SingletonOne.getInstance();
        SingletonOne two = SingletonOne.getInstance();
        System.out.println(one);
        System.out.println(two);
        System.out.println("===============");
        SingletonTwo one1 = SingletonTwo.getInstance();
        SingletonTwo two1 = SingletonTwo.getInstance();
        System.out.println(one1);
        System.out.println(two1);
    }
}
