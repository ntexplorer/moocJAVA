/**
 * @Time 2020/4/28 10:33
 * @Author
 * @Project moocJAVA
 * @Class SleepDemo
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise1.thread3;

/**
 * The type My thread.
 */
class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 15; i++) {
            System.out.println(Thread.currentThread().getName() + " is running the " + i + " time!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/**
 * The type Sleep demo.
 */
public class SleepDemo {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread t = new Thread(myThread);
        t.start();
        Thread t1 = new Thread(myThread);
        t1.start();
    }
}
