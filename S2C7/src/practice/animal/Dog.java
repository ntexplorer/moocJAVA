/**
 * @Time 2020/4/21 1:22
 * @Author
 * @Project moocJAVA
 * @Class Dog
 * @Software IntelliJ IDEA
 * @Version
 */

package practice.animal;

public class Dog extends Animal {
    private String sex;

    public Dog() {
    }

    public Dog(String name, int month, String sex) {
        super(name, month);
        this.setSex(sex);
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void sleep() {
        System.out.println("小狗有午睡的习惯");
    }

    @Override
    public void eat() {
        System.out.println("狗吃肉~");
    }
}
