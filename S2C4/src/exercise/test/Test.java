/**
 * @Time 2020/4/19 23:16
 * @Author
 * @Project moocJAVA
 * @Class Test
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise.test;

import exercise.work.DevelopmentWork;
import exercise.work.TestWork;
import exercise.work.Work;

/**
 * The type Test.
 */
public class Test {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Work work1 = new Work();
        TestWork work2 = new TestWork();
        DevelopmentWork work3 = new DevelopmentWork();

        work2.setWorkName("测试工作");
        work2.setTestCase(10);
        work2.setBugNum(5);

        work3.setWorkName("研发工作");
        work3.setAvailableLine(1000);
        work3.setUnfixedBug(10);

        System.out.print("父类信息测试：");
        System.out.println(work1.describeWork());
        System.out.print("测试工作类信息测试：");
        System.out.println(work2.describeWork());
        System.out.print("研发工作类信息测试：");
        System.out.println(work3.describeWork());

    }
}
