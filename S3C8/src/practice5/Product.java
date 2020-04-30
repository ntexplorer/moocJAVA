package practice5;

import java.io.Serializable;

/**
 * @author Tian Z
 */
public class Product implements Serializable {
    private int productId;
    private String productName;
    private String productCategory;
    private double price;

    @Override
    public String toString() {
        return "产品信息：" + productId +
                "\n产品名称：" + productName +
                "\n产品属性：" + productCategory +
                "\n产品价格：" + price +
                "元\n";
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(int productId, String productName, String productCategory, double price) {
        this.productId = productId;
        this.productName = productName;
        this.productCategory = productCategory;
        this.price = price;
    }
}
