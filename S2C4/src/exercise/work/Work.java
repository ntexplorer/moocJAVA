/**
 * @Time 2020/4/19 23:06
 * @Author
 * @Project moocJAVA
 * @Class Work
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise.work;

/**
 * The type Work.
 */
public class Work {
    private String workName;

    /**
     * Instantiates a new Work.
     */
    public Work() {
    }

    /**
     * Gets work name.
     *
     * @return the work name
     */
    public String getWorkName() {
        return workName;
    }

    /**
     * Sets work name.
     *
     * @param workName the work name
     */
    public void setWorkName(String workName) {
        this.workName = workName;
    }

    /**
     * Describe work string.
     *
     * @return the string
     */
    public String describeWork() {
        return "开心工作";
    }
}
