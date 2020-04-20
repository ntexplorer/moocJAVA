/**
 * @Time 2020/4/19 23:08
 * @Author
 * @Project moocJAVA
 * @Class TestWork
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise.work;

/**
 * The type Test work.
 */
public class TestWork extends Work {
    private int testCase;
    private int bugNum;

    /**
     * Instantiates a new Test work.
     */
    public TestWork() {
    }

    /**
     * Gets test case.
     *
     * @return the test case
     */
    public int getTestCase() {
        return testCase;
    }

    /**
     * Sets test case.
     *
     * @param testCase the test case
     */
    public void setTestCase(int testCase) {
        this.testCase = testCase;
    }

    /**
     * Gets bug num.
     *
     * @return the bug num
     */
    public int getBugNum() {
        return bugNum;
    }

    /**
     * Sets bug num.
     *
     * @param bugNum the bug num
     */
    public void setBugNum(int bugNum) {
        this.bugNum = bugNum;
    }

    @Override
    public String describeWork() {
        return this.getWorkName() + "的日报是：今天编写了" + this.getTestCase() + "个测试用例，发现了"
                + this.getBugNum() + "个bug。";
    }
}
