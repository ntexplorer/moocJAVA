/**
 * @Time : 2020/4/5 16:04
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : CharDemo
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class CharDemo {
    public static void main(String[] args) {
        char a = 'a';
        System.out.println("a=" + a);
        char ch = 65;
//        强制类型转换
        char ch1 = (char) 65536;
        System.out.println("ch=" + ch);
        System.out.println("ch1=" + ch1);

        char c = '\u005d';
        System.out.println("c=" + c);
    }
}
