/**
 * @Time 2020/4/23 0:17
 * @Author
 * @Project moocJAVA
 * @Class StringDemo4
 * @Software IntelliJ IDEA
 * @Version
 */

package string;

public class StringDemo4 {
    public static void main(String[] args) {
        String str1 = "imooc";
        String str2 = "imooc";
        String str3 = "imooc";
        System.out.println("str1 same content str2? " + (str1.equals(str2)));
        System.out.println("str1 same content str3? " + (str1.equals(str3)));

        System.out.println("str1 same address str2? " + (str1 == str2));
        System.out.println("str1 same address str3? " + (str1 == str3));
    }
}
