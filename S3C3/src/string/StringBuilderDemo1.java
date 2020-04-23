/**
 * @Time 2020/4/23 0:40
 * @Author
 * @Project moocJAVA
 * @Class StringBuilderDemo1
 * @Software IntelliJ IDEA
 * @Version
 */

package string;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        str.append(",").append(" imooc");
        System.out.println("str = " + str);
        str.delete(7, 12).insert(7, "MOOC");
        System.out.println(str);
        str.replace(7, 12, "iMoOc");
        System.out.println(str);
        String str1 = str.substring(0, 5);
        System.out.println(str1);
    }
}
