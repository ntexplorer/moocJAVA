import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Time : 2020/4/17 17:51
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : GradeManagement
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class GradeManagement {
    /**
     * 打印菜单
     */
    public void displayMenu() {
        System.out.println("**************************************");
        System.out.println("          1--初始化数学成绩");
        System.out.println("          2--求成绩的平均值");
        System.out.println("          3--统计成绩大于85分的人数");
        System.out.println("          4--修改指定位置处的成绩");
        System.out.println("          5--打印输出所有成绩");
        System.out.println("          0--退出");
        System.out.println("**************************************");
        System.out.println("请输入对应的数字进行操作: ");
    }

    /**
     * @return 返回一个float数组用于储存输入的成绩
     */
    public float[] initScore() {
        Scanner sc = new Scanner(System.in);
        int arrLen;
        try {
            System.out.println("请输入要存储的数学成绩的数量: ");
            arrLen = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("无效输入，请重试");
            String str = sc.next();
            System.out.println("请输入要存储的数学成绩的数量: ");
            arrLen = sc.nextInt();
        }
        float[] scoreStore = new float[arrLen];
        for (int i = 0; i < arrLen; i++) {
            try {
                System.out.println("请输入第" + (i + 1) + "个数据: ");
                scoreStore[i] = sc.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("无效输入，请重试");
                String str = sc.next();
                System.out.println("请输入第" + (i + 1) + "个数据: ");
                scoreStore[i] = sc.nextFloat();
            }
        }
        return scoreStore;
    }

    /**
     * @param f 接收生成的成绩数组作为参数
     * @return 返回一个float型的平均成绩
     */
    public float average(float[] f) {
        float sum = 0;
        for (float v : f) {
            sum += v;
        }
        return sum / f.length;
    }

    /**
     * @param f 接收成绩数组
     * @return 返回大于85分的人次，int型
     */
    public int count(float[] f) {
        int count = 0;
        for (float v : f) {
            if (v > 85) {
                count += 1;
            }
        }
        return count;
    }

    /**
     * 传三个参数则需将各println写入主方法，不利于封装，遂改为只写入一个
     * index和newScore的输入在本方法内完成
     *
     * @param f 接收成绩数组
     */
    public void update(float[] f) {
        System.out.println("修改前: ");
        System.out.println("成绩为: ");
        for (float v : f) {
            System.out.print(v + "  ");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int index;
        float newScore;
        try {
            System.out.println("请输入要修改数据的位置(从0开始): ");
            index = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("无效输入，请重试");
            String str = sc.next();
            System.out.println("请输入要修改数据的位置(从0开始): ");
            index = sc.nextInt();
        }
        try {
            System.out.println("请输入新数据: ");
            newScore = sc.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("无效输入，请重试");
            String str = sc.next();
            System.out.println("请输入新数据: ");
            newScore = sc.nextFloat();
        }
        f[index] = newScore;
        System.out.println("修改后: ");
        System.out.println("成绩为: ");
        for (float v : f) {
            System.out.print(v + "  ");
        }
        System.out.println();
    }

    /**
     * @param f 接收成绩数组，for循环打印
     */
    public void displayAllScore(float[] f) {
        System.out.println("成绩为: ");
        for (float v : f) {
            System.out.print(v + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        GradeManagement gm = new GradeManagement();
        float[] scoreStore = new float[0];
        while (true) {
            gm.displayMenu();
            try {
                int nextCommand = key.nextInt();
                if (nextCommand != 0) {
                    switch (nextCommand) {
                        case (1): {
                            scoreStore = gm.initScore();
                            break;
                        }
                        case (2): {
                            System.out.println("数学平均成绩为: " + gm.average(scoreStore));
                            break;
                        }
                        case (3): {
                            System.out.println("成绩大于85分的人数为: " + gm.count(scoreStore));
                            break;
                        }
                        case (4): {
                            gm.update(scoreStore);
                            break;
                        }
                        case (5): {
                            gm.displayAllScore(scoreStore);
                            break;
                        }
                        default: {
                            System.out.println("无效的数字，请重试!");
                        }
                    }
                } else {
                    System.out.println("退出程序!");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("请输入数字！");
                String str = key.next();
            }

        }
    }
}
