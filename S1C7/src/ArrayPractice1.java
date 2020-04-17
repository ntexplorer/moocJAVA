import java.util.Scanner;

/**
 * @Time : 2020/4/14 14:09
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : ArrayPractice1
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class ArrayPractice1 {
    public static void main(String[] args) {
        int[][] intArray = new int[3][2];
        Scanner sc = new Scanner(System.in);
        String module;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                if (j == 0) {
                    module = "语文";
                } else {
                    module = "数学";
                }
                System.out.println("请输入第" + (i + 1) + "个学生的" + module + "成绩: ");
                intArray[i][j] = sc.nextInt();
            }
        }
        int averageY, averageS, sumY = 0, sumS = 0;
        for (int i = 0; i < intArray.length; i++) {
            sumY += intArray[i][0];
            sumS += intArray[i][1];
        }
        averageY = sumY / intArray.length;
        averageS = sumS / intArray.length;
        System.out.println("语文的总成绩为: " + sumY);
        System.out.println("语文的平均分为: " + averageY);
        System.out.println("数学的总成绩为: " + sumS);
        System.out.println("数学的平均分为: " + averageS);
    }
}
