package personal.cat;

/**
 * @Time : 2020/4/18 0:12
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : personal.cat.Cat
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class Cat {
    //    Attributes: nickname, age, weight, species
//    private 限定只能在当前类内访问
    private String name;
    private int month;
    private double weight;
    private String species;
    //静态 静态成员、类成员 所有实例共用区域
    public static int price;


    {
        System.out.println("我是构造代码块");
        name = "Hua";
        price = 1999;
    } //构造代码块-优先于构造方法-每个实例执行一次

    static {
        price = 2000;
//        name = "Cong";
        System.out.println("我是静态代码块");
    } //静态代码块-优先于构造代码块-只执行一次

    public Cat() {
        System.out.println("我是构造无参数方法");
        System.out.println("我是宠物猫");
    }

    public Cat(String name) {
        System.out.println("我是构造带参数方法");
    }

    public Cat(String name, int month, double weight, String species) {
//      Call to this must be the first statement in the constructor body
//        this(" ");
//        this.name = name;
        this.setName(name);
//        this.month = month;
        this.setMonth(month);
        this.weight = weight;
        this.species = species;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return "我是一只名叫：" + this.name + "的宠物猫";
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month <= 0) {
            System.out.println("The age must be greater than 0");
        } else {
            this.month = month;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    //    Method: run, eat
    public void run() {
        System.out.println("The cat runs!");
        this.name = "lol";
        price = 20;
    }

    public void run(String name) {
        {
            System.out.println("我是普通代码块");
        } //普通代码块
        System.out.println("The cat named " + name + " is running!");
    }

    public static void eat() {
//        this.run();
//        静态方法中不能使用this
//        this.name= "lmao";
//        静态方法中不能直接访问同一个类中非静态成员，只能直接调用统一个类中的静态成员
//        只能通过对象实例化后，对象、成员方法的方式访问非静态成员
        Cat temp = new Cat();
        temp.run();
        temp.name = "lamo";
        price = 30;
        System.out.println("The cat eats!");
    }

}
