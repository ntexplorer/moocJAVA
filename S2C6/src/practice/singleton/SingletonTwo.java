/**
 * @Time 2020/4/21 0:57
 * @Author
 * @Project moocJAVA
 * @Class SingletonTwo
 * @Software IntelliJ IDEA
 * @Version
 */

package practice.singleton;

/**
 * 懒汉式:类内实例对象创建时并不直接初始化，直到第一次调用get方法
 * 时间换空间
 */
public class SingletonTwo {
    private SingletonTwo() {

    }

    private static SingletonTwo instance = null;

    public static SingletonTwo getInstance() {
        if (instance == null) {
            instance = new SingletonTwo();
        }
        return instance;
    }
}
