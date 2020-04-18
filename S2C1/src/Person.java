/**
 * @Time : 2020/4/18 0:50
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : Person
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class Person {
    String name;
    int age;
    String grade;

    public void student() {
        System.out.println("我是一名学生！");
    }

    public void sex(String sex) {
        System.out.println("我是一个" + sex + "孩！");
    }

    public void mySelf() {
        System.out.println("我叫" + name + "，今年" + age + "岁了，读小学" + grade + "年级了。");
    }
}
