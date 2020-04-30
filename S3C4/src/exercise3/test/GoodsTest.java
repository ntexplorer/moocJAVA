/**
 * @Time 2020/4/26 21:04
 * @Author
 * @Project moocJAVA
 * @Class GoodsTest
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise3.test;

import exercise3.model.Goods;

import java.util.*;

public class GoodsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Goods> goodsMap = new HashMap<>(3);
        System.out.println("Please enter 3 goods info:");
        int i = 0;
        int count = 3;
        while (i < count) {
            System.out.println("Please enter the number " + (i + 1) + " good:");
            System.out.println("Please enter goods id: ");
            String goodsId = scanner.next();
            if (goodsMap.containsKey(goodsId)) {
                System.out.println("ID already exist!");
                continue;
            }
            System.out.println("Please enter goods name:");
            String goodsName = scanner.next();
            System.out.println("Please enter the price:");
            double goodsPrice = 0;
            try {
                goodsPrice = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input!");
                scanner.next();
                continue;
            }
            Goods goods = new Goods(goodsId, goodsName, goodsPrice);
            goodsMap.put(goodsId, goods);
            i++;
        }

        System.out.println("All the goods info:");
        Iterator<Goods> itGoods = goodsMap.values().iterator();
        while (itGoods.hasNext()) {
            System.out.println(itGoods.next());
        }
    }
}
