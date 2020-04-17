/**
 * @Time : 2020/4/16 15:03
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : MethodDemo
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class MethodDemo {
    public static void main(String[] args) {
//        System.out.println("*************************");
        MethodDemo myMethod = new MethodDemo();
        myMethod.printAster();
        System.out.println("Welcome to JAVA world.");
        myMethod.printAster();
//        System.out.println("*************************");
    }

    //    method to print a line of asters
    public void printAster() {
        System.out.println("*************************");
    }
}
