/**
 * @Time 2020/4/22 22:16
 * @Author
 * @Project moocJAVA
 * @Class HelloWorld
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise1;

public class HelloWorld {
    public static void main(String[] args) {
        int score = 100;
        Integer score1 = Integer.valueOf(score);
        Double score2 = Double.valueOf(score1);
        Long score3 = Long.valueOf(score1);
        int score4 = score1.intValue();
        System.out.println("score对应的Integer类型结果为:" + score1);
        System.out.println("score对应的Double类型结果为:" + score2);
        System.out.println("score对应的Long类型结果为:" + score3);
        System.out.println("重新由Integer转换为int类型的结果为:" + score4);
    }
}
