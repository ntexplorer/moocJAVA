package exercise1.thread5;

class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(this.getName() + " is running! " + i + " time.");
        }
    }
}

/**
 * @author ntexp
 */
public class PriorityDemo {
    public static void main(String[] args) {
        int mainPriority = Thread.currentThread().getPriority();
        System.out.println("Main thread priority is " + mainPriority);

        MyThread myThread = new MyThread("Thread 1");
        myThread.setPriority(Thread.MAX_PRIORITY);
        myThread.start();
        System.out.println(myThread.getName() + " priority is " + myThread.getPriority());
    }
}
