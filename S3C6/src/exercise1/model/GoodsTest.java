/**
 * @Time 2020/4/27 17:15
 * @Author
 * @Project moocJAVA
 * @Class GoodsTest
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise1.model;

import java.util.ArrayList;
import java.util.List;

public class GoodsTest {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book());
        books.add(new Book());

        List<Clothes> clothes = new ArrayList<>();
        clothes.add(new Clothes());
        clothes.add(new Clothes());

        List<Shoes> shoes = new ArrayList<>();
        shoes.add(new Shoes());
        shoes.add(new Shoes());

        GoodsSeller goodsSeller = new GoodsSeller();
        goodsSeller.sellGoods(books);
        goodsSeller.sellGoods(shoes);
        goodsSeller.sellGoods(clothes);
    }
}
