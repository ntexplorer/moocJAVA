/**
 * @Time : 2020/4/17 11:56
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : ArrayDemo
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class ArrayDemo {
    public void updateArray(int[] arr) {
        arr[3] = 15;
        System.out.println("Array arr elements are: ");
        for (int n : arr) {
            System.out.print(n + "  ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayDemo ad = new ArrayDemo();
        int[] a1 = {1, 2, 3, 4, 5};
        System.out.println("a1 before method is ");
        for (int n : a1) {
            System.out.print(n + "  ");

        }
        System.out.println();
        ad.updateArray(a1);
        System.out.println("a1 after method is ");
        for (int n : a1) {
            System.out.print(n + "  ");
        }
    }
}
