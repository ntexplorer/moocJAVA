/**
 * @Time 2020/4/19 22:36
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void sleep() {
        super.eat();
        super.month = 13;
        System.out.println(this.getName() + " is a " + this.getMonth() + " year old dog who is sleeping.");
    }

    /*
     * 方法重载：
     * 1、同一个类中
     * 2、方法名相同，参数列表不同（顺序、个数、类型）
     * 3、方法返回值、访问修饰符不做限制
     * 4、与方法的参数名称无关
     *
     * 方法重写：
     * 1、方法名相同、参数列表相同（参数顺序、个数、类型），方法返回值可以允许是父类对应的子类
     * 2、有继承关系的子类中
     * 3、子类重写父类的方法
     * 4、访问修饰符-访问范围需要大于等于父类的范围
     * 5、方法参数名无关
     * */

    @Override
    public void eat() {
        System.out.println(this.getName() + " doesn't want to eat.");
    }

    @Override
    public void eat(String month) {
        System.out.println(month + " doesn't want to eat.");
    }

}
