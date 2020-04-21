package practice2.telephone;

/**
 * @author ntexp
 */
public interface INet {
    /**
     * 上网能力
     * 声明接口方法不需要public
     * 也不需要写abstract
     */
    void network();


//接口中可以包含常量，默认自动public static final

    int TEMP = 20;

//    默认方法

    /**
     * 连接能力
     */
    default void connection() {
        System.out.println("我是接口中的默认方法");
    }

    /**
     * 结束
     */
    static void stop() {
        System.out.println("我是接口中的静态方法");
    }
}
