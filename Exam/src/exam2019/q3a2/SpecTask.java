package exam2019.q3a2;

/**
 * @author Tian Z
 */
public class SpecTask extends GenTask implements Runnable {
    public SpecTask(int taskNumber) {
        super(taskNumber);
    }

    @Override
    public void run() {
        System.out.println("Task " + this.getTaskNumber() + " is running.");
    }
}
