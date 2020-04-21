/**
 * @Time 2020/4/21 0:54
 * @Author
 * @Project moocJAVA
 * @Class Test
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise1.test;


import exercise1.singleton.Earth;

public class Test {
    public static void main(String[] args) {
        System.out.println("第一个地球创建中。。。");
        System.out.println(Earth.getEarth());
        System.out.println("第二个地球创建中。。。");
        System.out.println(Earth.getEarth());
        System.out.println("第三个地球创建中。。。");
        System.out.println(Earth.getEarth());
        System.out.println("问：三个地球是同一个么？");

    }
}
