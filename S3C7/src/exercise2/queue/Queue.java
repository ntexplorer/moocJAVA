package exercise2.queue;

/**
 * @author Tian Z
 */
public class Queue {
    private int n;
    boolean flag = false;

    public synchronized int get() {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consume: " + n);
        flag = false;
        notifyAll();
        return n;
    }

    public synchronized void set(int n) {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Produce: " + n);
        this.n = n;
        flag = true;
        notifyAll();
    }
}
