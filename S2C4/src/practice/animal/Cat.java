/**
 * @Time 2020/4/19 22:31
 * @Author
 * @Project moocJAVA
 * @Class Cat
 * @Software IntelliJ IDEA
 * @Version
 */

package practice.animal;

public class Cat extends Animal {
    private double weight;
    public int temp = 300;

    public static int st3 = 44;

    static {
        System.out.println("我是子类的静态代码块");
    }

    {
        System.out.println("我是子类的构造代码块");
    }

    public Cat() {
//        this.month = 1;
        System.out.println("我是子类的无参构造方法");
    }

    public Cat(String name, int month) {
        /*        子类构造默认调用父类的无参构造，
        可以通过super()调用父类允许被访问的其他构造方法
        super()必须放在子类构造方法有效代码第一行
         */
//        super(name, month);
        this();
        System.out.println("我是子类的双参构造");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void run() {
        System.out.println(this.getName() + " is a " + this.getSpecies() + " cat who runs happily.");
    }

}
