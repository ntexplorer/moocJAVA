/**
 * @Time 2020/4/27 17:13
 * @Author
 * @Project moocJAVA
 * @Class Book
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise1.model;

/**
 * The type Book.
 */
public class Book extends BaseGoods {
    @Override
    public void sell() {
        System.out.println("Sell Books.");
    }
}
