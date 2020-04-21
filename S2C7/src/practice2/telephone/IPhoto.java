package practice2.telephone;

/**
 * @author ntexp
 */
public interface IPhoto {
    /**
     * 具有拍照能力
     */
    void takePhoto();

    /**
     * 照相链接
     */
    default void connection() {
        System.out.println("这是Photo里的默认方法");
    }
}
