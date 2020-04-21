/**
 * @Time 2020/4/21 15:42
 * @Author
 * @Project moocJAVA
 * @Class Camera
 * @Software IntelliJ IDEA
 * @Version
 */

package practice2.telephone;

public class Camera implements IPhoto, INet {
    @Override
    public void takePhoto() {
        System.out.println("相机可以拍照");
    }

    @Override
    public void network() {
        System.out.println("相机可以上网");
    }

    @Override
    public void connection() {
        System.out.println("相机可以链接");
    }
}
