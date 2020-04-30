package exercise7;

import java.io.Serializable;

/**
 * The type Goods.
 *
 * @author Tian Z
 */
public class Goods implements Serializable {
    private String goodsId;
    private String goodsName;
    private double price;

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId='" + goodsId + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", price=" + price +
                '}';
    }

    /**
     * Gets goods id.
     *
     * @return the goods id
     */
    public String getGoodsId() {
        return goodsId;
    }

    /**
     * Sets goods id.
     *
     * @param goodsId the goods id
     */
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * Gets goods name.
     *
     * @return the goods name
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * Sets goods name.
     *
     * @param goodsName the goods name
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Instantiates a new Goods.
     *
     * @param goodsId   the goods id
     * @param goodsName the goods name
     * @param price     the price
     */
    public Goods(String goodsId, String goodsName, double price) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.price = price;
    }
}
