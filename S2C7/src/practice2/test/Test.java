/**
 * @Time 2020/4/21 15:38
 * @Author
 * @Project moocJAVA
 * @Class Test
 * @Software IntelliJ IDEA
 * @Version
 */

package practice2.test;

import practice2.telephone.*;

public class Test {
    public static void main(String[] args) {
        FourthPhone phone = new FourthPhone();
        phone.call();
        phone.message();
        phone.music();
        phone.video();
        phone.network();
        phone.takePhoto();

        IPhoto tp = new FourthPhone();
        IPhoto tp2 = new Camera();
        tp.takePhoto();
        tp2.takePhoto();

        System.out.println(INet.TEMP);

        INet tp3 = new SmartWatch();
        SmartWatch sw1 = new SmartWatch();
        System.out.println(INet.TEMP);
        tp3.network();
        tp3.connection();
        sw1.connection();
        INet.stop();

        System.out.println("==================");
        phone.connection();

    }
}
