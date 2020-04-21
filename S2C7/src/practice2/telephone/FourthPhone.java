/**
 * @Time 2020/4/21 15:37
 * @Author
 * @Project moocJAVA
 * @Class FourthPhone
 * @Software IntelliJ IDEA
 * @Version
 */

package practice2.telephone;

public class FourthPhone extends ThirdPhone implements IPhoto, INet {
//    public void photo() {
//        System.out.println("拍照");
//    }

    @Override
    public void network() {
        System.out.println("手机可以上网");
    }

//    @Override
//    public void connection() {
//        System.out.println("手机可以链接");
//    }

    public void game() {
        System.out.println("玩游戏");
    }

    @Override
    public void takePhoto() {
        System.out.println("手机可以拍照");
    }
}
