/**
 * @Time : 2020/4/17 11:05
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : PrintArray
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class PrintArray {
    public void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        PrintArray pa = new PrintArray();
        pa.printArray(arr);
    }
}
