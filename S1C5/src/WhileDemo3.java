/**
 * @Time : 2020/4/13 16:10
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : WhileDemo3
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class WhileDemo3 {
    public static void main(String[] args) {
        char ch = 'a';
        int count = 1;
        char z = 'z';
        while (ch <= z) {
            System.out.print(ch + " ");
            ch++;
            if (count % 13 == 0) {
                System.out.println();
            }
            count += 1;
        }
    }
}
