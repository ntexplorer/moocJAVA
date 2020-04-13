import java.util.Scanner;

/**
 * @Time : 2020/4/13 15:33
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : CharDemo
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class CharDemo {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String st = k.nextLine();
        char[] ch1 = st.toCharArray();
        char ch = ch1[0];
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("元音字母" + ch);
                break;
            default:
                System.out.println("不是元音字母");
        }
    }
}
