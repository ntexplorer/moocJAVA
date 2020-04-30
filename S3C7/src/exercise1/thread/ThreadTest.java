/**
 * @Time 2020/4/27 23:07
 * @Author
 * @Project moocJAVA
 * @Class ThreadTest
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise1.thread;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(getName() + " The thread is running!");
    }
}

/**
 * @author ntexp
 */
public class ThreadTest {
    public static void main(String[] args) {
//        System.out.println("Main thread 1");
        MyThread myThread = new MyThread();
        myThread.start(); // start the thread
//        System.out.println("Main thread 2");
    }
}
