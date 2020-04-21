/**
 * @Time 2020/4/21 19:23
 * @Author
 * @Project moocJAVA
 * @Class Test
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise4;

public class Test {
    public static void main(String[] args) {
        BallTest.Inner_m one = new BallTest().new Inner_m();
        one.play();

        BallTest two = new BallTest();
        two.info();

        new Ball() {

            @Override
            public void play() {
                System.out.println("**************");
                System.out.println("匿名内部类");
                System.out.println("打排球");
            }
        }.play();
    }
}
