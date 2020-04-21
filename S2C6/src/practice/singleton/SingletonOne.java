/**
 * @Time 2020/4/21 0:44
 * @Author Tian
 * @Project moocJAVA
 * @Class SingletonOne
 * @Software IntelliJ IDEA
 * @Version
 */

package practice.singleton;

/**
 * 饿汉式：创建对象实例的时候直接初始化
 * 空间换时间
 *
 * @author ntexp
 */
public class SingletonOne {
    private SingletonOne() {

    }

    private static final SingletonOne instance = new SingletonOne();

    public static SingletonOne getInstance() {
        return instance;
    }
}
