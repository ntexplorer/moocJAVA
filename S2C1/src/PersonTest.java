/**
 * @Time : 2020/4/18 0:54
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : PersonTest
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class PersonTest {
    public static void main(String[] args) {
        Person xiaoMing = new Person();
        xiaoMing.name = "小明";
        xiaoMing.age = 10;
        xiaoMing.grade = "五";
        xiaoMing.student();
        xiaoMing.sex("男");
        xiaoMing.mySelf();
    }
}

