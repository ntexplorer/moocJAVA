/**
 * @Time 2020/4/23 0:02
 * @Author
 * @Project moocJAVA
 * @Class StringDemo
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise1;

public class StringDemo {
    public static void main(String[] args) {
        String str = "abcdefg";
        String str1 = str.substring(2, 5);
        String str2 = str1.toUpperCase();
        String str3 = str2.replace("DE", "MM");
        System.out.println(str3);
    }
}
