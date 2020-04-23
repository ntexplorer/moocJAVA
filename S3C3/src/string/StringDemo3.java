/**
 * @Time 2020/4/23 0:07
 * @Author
 * @Project moocJAVA
 * @Class StringDemo3
 * @Software IntelliJ IDEA
 * @Version
 */

package string;

import java.io.UnsupportedEncodingException;

public class StringDemo3 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "JAVA programming basics";
        byte[] byteArr = str.getBytes("GBK");
        for (byte value : byteArr) {
            System.out.print(value + " ");
        }
        System.out.println();
//        keep the consistency of the encoding
        String str2 = new String(byteArr, "GBK");
        System.out.println(str2);
    }
}
