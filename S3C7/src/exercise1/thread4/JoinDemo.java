/**
 * @Time 2020/4/28 10:51
 * @Author
 * @Project moocJAVA
 * @Class JoinDemo
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise1.thread4;

/**
 * The type My thread.
 */
class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 500; i++) {
            System.out.println(getName() + " is running " + i + " times!");
        }
    }
}

/**
 * The type Join demo.
 *
 * @author ntexp
 */
public class JoinDemo {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.join(1);
        for (int i = 1; i <= 20; i++) {
            System.out.println("Main thread is running " + i + " times!");
        }
    }
}
