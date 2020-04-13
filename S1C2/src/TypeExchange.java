/**
 * @Time : 2020/4/7 12:32
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : TypeExchange
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class TypeExchange {
    public static void main(String[] args) {
//        char c= (char) 65536;
//        int n;
//        n=c;
//        c= (char) n;
//
//        int x=100;
//        long y=x;
//        x= (int) y;
//        float f=1000000000000000L;
//        System.out.println("f="+f);
//        float f1=1023879548729148L;
//        System.out.println("f1="+f1);

//        Code Exercise
        char c = (char) 67832;
        System.out.println("c=" + c);
        int n = 65;
        char c1 = (char) n;
        System.out.println("c1=" + c1);
        long l = 987654321L;
        int i = (int) l;
        System.out.println("i=" + i);
        float f = l;
        System.out.println("f=" + f);
        l = (long) f;
        System.out.println("l=" + l);
    }
}
