/**
 * @Time 2020/4/22 23:42
 * @Author
 * @Project moocJAVA
 * @Class StringDemo1
 * @Software IntelliJ IDEA
 * @Version
 */

package string;

public class StringDemo1 {
    public static void main(String[] args) {
        String str = "JAVA programming fundamental";
        System.out.println("The length of the string is " + str.length());
        System.out.println("The sixth character of the string is " + str.charAt(5));
        String str1 = str.substring(5);
        System.out.println(str1);
        String str2 = str.substring(5, 16);
        System.out.println(str2);
    }
}
