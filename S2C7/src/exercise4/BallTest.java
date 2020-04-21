/**
 * @Time 2020/4/21 19:18
 * @Author
 * @Project moocJAVA
 * @Class BallTest
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise4;

import org.jetbrains.annotations.NotNull;

public class BallTest {
    public void playBall(@NotNull Ball ball) {
        ball.play();
    }

    class Inner_m implements Ball {
        @Override
        public void play() {
            System.out.println("成员内部类");
            System.out.println("打篮球");
        }
    }

    public void info() {
        class Inner_f implements Ball {
            @Override
            public void play() {
                System.out.println("************");
                System.out.println("方法内部类");
                System.out.println("打乒乓球");
            }
        }
        new Inner_f().play();
    }

}
