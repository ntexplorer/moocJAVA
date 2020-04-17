/**
 * @Time : 2020/4/14 13:49
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : ArrayDemo
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class ArrayDemo {
    public static void main(String[] args) {
//        Recommended
        int[][] intArray;
//        Not recommended
//        float floatArray[][];
//        double[] doubleArray[];
        intArray = new int[3][3];
        System.out.println("The element in row 3 column 2 is:" + intArray[2][1]);
        intArray[2][2] = 9;
        char[][] ch = new char[3][5];
        float[][] floatArray = new float[3][];
        floatArray[0] = new float[3];
        floatArray[1] = new float[4];
        floatArray[2] = new float[5];
        System.out.println(floatArray[2][0]);
    }
}
