package exam2019.q3a2;

/**
 * @author Tian Z
 */
public class TaskTest {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i < 9; i++) {
            Thread thread = new Thread(new SpecTask(i));
            thread.start();
            thread.join();
        }
        System.out.println("All task finished.");

    }
}
