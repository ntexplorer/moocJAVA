package exam2018.q1b2;


/**
 * @author Tian Z
 */
public class TaskTest {
    public static void main(String[] args) {
        MyTask[] taskList = new MyTask[10];
        for (int i = 0; i < taskList.length; i++) {
            taskList[i] = new MyTask(i + 1);
            taskList[i].start();
        }
        try {
            for (MyTask myTask : taskList) {
                myTask.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All tasks finished!");

    }
}
