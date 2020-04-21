/**
 * @Time 2020/4/20 19:58
 * @Author
 * @Project moocJAVA
 * @Class Taxi
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise2.model;

public class Taxi extends Car {
    private final String company;

    public Taxi(String color, String userName, String company) {
        super(color, userName);
        this.company = company;
    }

    public final void ride() {
        System.out.println(this.getUserName() + "的出租车是属于在" + this.company + "公司的。");
    }

    @Override
    public void use() {
        System.out.println("出租车是提高市民生活质量的重要条件之一。");
    }

    @Override
    public String toString() {
        return "taxi的信息是：" + this.getUserName() + "拥有一辆" + this.getColor() + "色的出租车。";
    }
}
