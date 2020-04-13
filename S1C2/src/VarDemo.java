/**
 * @Time : 2020/4/7 12:12
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : VarDemo
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class VarDemo {
    public static void main(String[] args) {
//        int x = 0,y = 0;
        int x, y;
        x = 3;
        y = 5;
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.print(x + " " + y);
        System.out.println("\n" + x + "," + y);
        System.out.println(x + '\t' + y + '\n');

//        double d = 1.23E5;
//        System.out.println("d=" + d);

        int n = 98;
        char ch = (char) n;
        long var = (long) 1.9E8;
        double d = var;
        System.out.println("ch=" + ch);
        System.out.println("var=" + var);
        System.out.println("d=" + d);

    }
}
