/**
 * @Time 2020/4/23 0:22
 * @Author
 * @Project moocJAVA
 * @Class StringDemo5
 * @Software IntelliJ IDEA
 * @Version
 */

package string;

public class StringDemo5 {
    public static void main(String[] args) {
        String s1 = "imooc";
        String s2 = "hello, " + s1;
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        String s3 = "hello, imooc";
        System.out.println("substring: " + s3.substring(0, 5));
        System.out.println("s3 = " + s3);
    }
}
