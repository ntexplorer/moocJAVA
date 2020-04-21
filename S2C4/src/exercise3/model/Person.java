/**
 * @Time 2020/4/20 18:30
 * @Author
 * @Project moocJAVA
 * @Class Person
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise3.model;

public class Person {
    private String name;
    private int age;
    private String sex;
    public static String a = " aa";

    public Person() {
    }

    public Person(String name, int age, String sex) {
        this.setName(name);
        this.setAge(age);
        this.setSex(sex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "姓名：" + this.getName() + "  年龄：" + this.getAge() + "  性别：" + this.getSex();
    }

    public void test() {
        final Person p1 = new Person("HUA", 1, "Male");
        p1.setName("Fan");
        System.out.println(p1.getName());
    }
}
