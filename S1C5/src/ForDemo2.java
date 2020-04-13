/**
 * @Time : 2020/4/13 19:17
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : ForDemo2
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class ForDemo2 {
    public static void main(String[] args) {
        int i = 1;
        for (; ; ) {
            System.out.print(i + " ");
            if (i == 10) {
                break;
            } else {
                i++;
            }
        }
    }
}
