/**
 * @Time : 2020/4/13 19:29
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : ForPrac1
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class ForPrac1 {
    public static void main(String[] args) {
        int ge, shi, bai;
        for (int n = 200; n <= 300; n++) {
            bai = n / 100;
            shi = (n - bai * 100) / 10;
            ge = n - bai * 100 - shi * 10;
            int resultTime = bai * shi * ge;
            int resultSum = bai + shi + ge;
            if (resultTime == 42 && resultSum == 12) {
                System.out.println(n);
            }
        }
    }
}
