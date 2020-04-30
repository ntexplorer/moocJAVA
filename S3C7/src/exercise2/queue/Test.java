package exercise2.queue;

/**
 * @author Tian Z
 */
public class Test {
    public static void main(String[] args) {
        Queue queue = new exercise2.queue.Queue();
        new Thread(new Producer(queue)).start();
        new Thread(new Consumer(queue)).start();
    }
}
