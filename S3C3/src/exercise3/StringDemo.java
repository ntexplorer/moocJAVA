/**
 * @Time 2020/4/23 0:58
 * @Author
 * @Project moocJAVA
 * @Class StringDemo
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise3;

public class StringDemo {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("abc");
        str.append("---def").reverse();
        System.out.println(str);
        str.delete(3, 6);
        System.out.println(str);
    }
}
