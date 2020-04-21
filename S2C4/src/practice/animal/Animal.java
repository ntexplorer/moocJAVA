/**
 * @Time 2020/4/19 22:29
 * @Author Tian
 * @Project moocJAVA
 * @Class Animal
 * @Software IntelliJ IDEA
 * @Version 1.0
 */

package practice.animal;

public class Animal {
    private String name = "nine";
    protected int month = 2;

//    protected: 允许在当前类、同包子类、同包非子类、跨包子类调用
//    跨包非子类不允许

//    默认：允许在当前类、同包子类、同包非子类调用
//    不允许跨包子类、跨包非子类调用

    private String species = "Dong";
    public int temp = 15;

//    private static final int ST1 = 22;

    public static int st2 = 23;

    static {
        System.out.println("我是父类的静态代码块");
    }

    {
        System.out.println("我是父类的构造代码块");
    }

    public Animal() {
        System.out.println("我是父类的无参构造方法");
    }

    public Animal(String name, int month) {
        this.name = name;
        this.month = month;
        System.out.println("我是父类的双参构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void eat() {
        System.out.println(this.getName() + " is eating.");
    }

    public void eat(String name) {
        System.out.println(name + " is testing eating.");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        Animal temp = (Animal) obj;
        return this.getName().equals(temp.getName()) && (this.getMonth() == temp.getMonth());
    }

    public boolean equals(Animal obj) {
        if (obj == null) {
            return false;
        }
        return this.getName().equals(obj.getName()) && (this.getMonth() == obj.getMonth());
    }

    @Override
    public String toString() {
        return "昵称：" + this.getName() + "，年龄：" + this.getMonth();
    }
}
