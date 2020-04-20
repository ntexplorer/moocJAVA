/**
 * @Time 2020/4/19 23:09
 * @Author
 * @Project moocJAVA
 * @Class DevelopmentWork
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise.work;

/**
 * The type Development work.
 */
public class DevelopmentWork extends Work {
    private int availableLine;
    private int unfixedBug;

    /**
     * Instantiates a new Development work.
     */
    public DevelopmentWork() {
    }

    /**
     * Gets available line.
     *
     * @return the available line
     */
    public int getAvailableLine() {
        return availableLine;
    }

    /**
     * Sets available line.
     *
     * @param availableLine the available line
     */
    public void setAvailableLine(int availableLine) {
        this.availableLine = availableLine;
    }

    /**
     * Gets unfixed bug.
     *
     * @return the unfixed bug
     */
    public int getUnfixedBug() {
        return unfixedBug;
    }

    /**
     * Sets unfixed bug.
     *
     * @param unfixedBug the unfixed bug
     */
    public void setUnfixedBug(int unfixedBug) {
        this.unfixedBug = unfixedBug;
    }

    @Override
    public String describeWork() {
        return this.getWorkName() + "的日报是：今天编写了" + this.getAvailableLine() + "行代码，目前仍然有"
                + this.getUnfixedBug() + "个bug没有解决。";
    }
}
