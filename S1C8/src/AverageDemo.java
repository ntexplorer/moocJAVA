/**
 * @Time : 2020/4/17 11:13
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : AverageDemo
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class AverageDemo {
    public void getAverage(float[] arr) {
        float sum = 0;
        for (float v : arr) {
            sum += v;
        }
        float average = sum / arr.length;
        System.out.println("数组的平均值为：" + average);
    }

    public static void main(String[] args) {
        float[] arr = {78.5f, 98.5f, 65.5f, 32.5f, 75.5f};
        AverageDemo ad = new AverageDemo();
        ad.getAverage(arr);
    }
}
