/**
 * @Time : 2020/4/18 17:16
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : Monkey
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class Monkey {
    String name;
    String feature;

    public Monkey() {
        System.out.println("我是使用无参构造产生的猴子：");
        this.name = "长尾猴";
        this.feature = "尾巴长";
        System.out.println("名称：" + this.name);
        System.out.println("特征：" + this.feature);
    }

    public Monkey(String name, String feature) {
        System.out.println("我是使用带参构造产生的猴子：");
        this.name = name;
        this.feature = feature;
        System.out.println("名称：" + this.name);
        System.out.println("特征：" + this.feature);
    }
}
