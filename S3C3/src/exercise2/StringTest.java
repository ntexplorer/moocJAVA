/**
 * @Time 2020/4/23 0:50
 * @Author
 * @Project moocJAVA
 * @Class StringTest
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise2;

public class StringTest {
    public static void main(String[] args) {
        StringBuilder welcome = new StringBuilder("欢迎来到");
        welcome.append("imooc");
        welcome.delete(0, 4).insert(0, "你好！");
        welcome.replace(2, 3, "，");
        System.out.println(welcome);
    }
}
