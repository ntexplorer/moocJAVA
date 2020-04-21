/**
 * @Time 2020/4/20 18:06
 * @Author
 * @Project moocJAVA
 * @Class Test3
 * @Software IntelliJ IDEA
 * @Version
 */

package practice.test;

import practice.animal.Animal;

public class Test3 {
    public static void main(String[] args) {
        Animal one = new Animal("HUA", 2);
        Animal two = new Animal("HUA", 2);
        /*
         * 1、继承Object中的equals方法，比较的是两个引用是否指向同一个对象
         * 2、子类可以通过重写equals方法的形式改变比较的内容
         * */
        boolean flag = one.equals(two);
        System.out.println("one 和 two的引用比较：" + flag);
        System.out.println("one 和 two的引用比较：" + (one == two));
        System.out.println("=================");
        String str1 = "hello";
        String str2 = "hello";
        flag = str1.equals(str2);
        System.out.println("str1  和 st2的引用比较：" + flag);
        System.out.println("str1  和 st2的引用比较：" + (str1 == str2));
        System.out.println("=================");
        System.out.println(one.toString());
//        输出对象名默认自动调用toString方法
        System.out.println(one);
        System.out.println("=================");
        System.out.println(str1);
    }
}
