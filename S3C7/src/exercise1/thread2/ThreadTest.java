/**
 * @Time 2020/4/27 23:12
 * @Author
 * @Project moocJAVA
 * @Class ThreadTest
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise1.thread2;

/**
 * The type My thread.
 */
class MyThread extends Thread {
    /**
     * Instantiates a new My thread.
     *
     * @param name the name
     */
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + " is running the " + i + " time!");
        }
    }
}

/**
 * The type Thread test.
 */
public class ThreadTest {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("thread1");
        MyThread myThread2 = new MyThread("thread2");
        myThread1.start();
        myThread2.start();
    }
}
