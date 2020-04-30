/**
 * @Time 2020/4/27 23:18
 * @Author
 * @Project moocJAVA
 * @Class Test
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise1.runnable;

/**
 * The type Print runnable.
 */
class PrintRunnable implements Runnable {
    int i = 1;

    @Override
    public void run() {

        while (i <= 10) {
            System.out.println(Thread.currentThread().getName() + " is running the " + (i++) + " time!");
        }
    }
}

/**
 * The type Test.
 */
public class Test {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        PrintRunnable printRunnable = new PrintRunnable();
        Thread thread = new Thread(printRunnable);
        thread.start();
        PrintRunnable printRunnable1 = new PrintRunnable();
        Thread thread1 = new Thread(printRunnable);
        thread1.start();
    }
}
