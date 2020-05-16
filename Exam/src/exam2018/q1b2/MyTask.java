package exam2018.q1b2;

/**
 * @author Tian Z
 */
public class MyTask extends Thread {
    private int taskId;

    public MyTask(int taskId) {
        this.taskId = taskId;
    }


    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("The task " + this.getTaskId() + " is running!");
    }
}