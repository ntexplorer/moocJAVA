/**
 * @Time 2020/4/22 22:51
 * @Author
 * @Project moocJAVA
 * @Class HelloWorld
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise3;

public class HelloWorld {
    public static void main(String[] args) {
        float f1 = 88.99f;
        String str1 = String.valueOf(f1);
        System.out.println("f1转换为String型后与整数20的求和结果为：" + (str1 + 20));

        String str = "188.55";
        double d2 = Double.parseDouble(str);
        System.out.println("str转换为double型后与整数20的求和结果为：" + (d2 + 20));
    }
}
