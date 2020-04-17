/**
 * @Time : 2020/4/17 11:54
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : ExchangeDemo1
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class ExchangeDemo1 {
    public void add(int n) {
        n++;
        System.out.println("n in Method: " + n);

    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("n before method: " + n);
        ExchangeDemo1 ed1 = new ExchangeDemo1();
        ed1.add(n);
        System.out.println("n after method: " + n);
    }
}
