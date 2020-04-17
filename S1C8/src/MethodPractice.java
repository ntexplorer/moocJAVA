/**
 * @Time : 2020/4/16 15:24
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : MethodPractice
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class MethodPractice {
    public void getPrice(float originalPrice) {
        float finalPrice;
        if (originalPrice < 100) {
            finalPrice = originalPrice;
        } else if (originalPrice < 200) {
            finalPrice = originalPrice * 0.95f;
        } else {
            finalPrice = originalPrice * 0.85f;
        }
        System.out.println("折后商品总价为: " + finalPrice);
    }

    public static void main(String[] args) {
        MethodPractice mp = new MethodPractice();
        mp.getPrice(150f);
    }
}
