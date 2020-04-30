/**
 * @Time 2020/4/27 17:14
 * @Author
 * @Project moocJAVA
 * @Class GoodsSeller
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise1.model;

import java.util.List;

public class GoodsSeller {
    public void sellGoods(List<? extends BaseGoods> goods) {
        for (BaseGoods g : goods) {
            g.sell();
        }
    }
}
