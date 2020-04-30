/**
 * @Time 2020/4/27 11:27
 * @Author
 * @Project moocJAVA
 * @Class GoodsTest
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise1;

import java.util.ArrayList;
import java.util.List;

public class GoodsTest {
    public static void main(String[] args) {
        Goods g1 = new Goods("S001", "Fridge", 2000);
        Goods g2 = new Goods("S002", "Television", 5000);
        Goods g3 = new Goods("S003", "Phone", 3000);

        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(g1);
        goodsList.add(g2);
        goodsList.add(g3);

        System.out.println("Before sorted:");
        for (Goods goods : goodsList) {
            System.out.println(goods);
        }

        goodsList.sort(Goods::compareTo);

        System.out.println("After sorted:");
        for (Goods goods : goodsList) {
            System.out.println(goods);
        }

    }
}
