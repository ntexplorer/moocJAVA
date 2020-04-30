/**
 * @Time 2020/4/27 11:24
 * @Author
 * @Project moocJAVA
 * @Class Goods
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise1;

public class Goods implements Comparable<Goods> {
    private String id;
    private String name;
    private double price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Goods(String id, String name, double price) {
        this.setId(id);
        this.setName(name);
        this.setPrice(price);
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Goods() {
    }

    @Override
    public int compareTo(Goods o) {
        double price1 = this.getPrice();
        double price2 = o.getPrice();
        return (int) (price2 - price1);
    }
}
