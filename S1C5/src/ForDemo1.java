/**
 * @Time : 2020/4/13 19:10
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : ForDemo1
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class ForDemo1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int n = 1; n <= 5; n++) {
            sum += n;
        }
//        System.out.println(n);
//        ** n is a locale variable **
        System.out.println("Sum of 1-5 is: " + sum);
    }
}
