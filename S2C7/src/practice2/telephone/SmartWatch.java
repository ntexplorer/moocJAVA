/**
 * @Time 2020/4/21 15:46
 * @Author
 * @Project moocJAVA
 * @Class Watch
 * @Software IntelliJ IDEA
 * @Version
 */

package practice2.telephone;

public class SmartWatch implements INet, IPhoto {
    public static final int TEMP = 33;


    @Override
    public void network() {
        System.out.println("手表可以上网");
    }

    @Override
    public void connection() {
        System.out.println("手表自己的connection方法");
    }

    @Override
    public void takePhoto() {

    }

}
