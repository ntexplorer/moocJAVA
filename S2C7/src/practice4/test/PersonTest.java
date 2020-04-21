/**
 * @Time 2020/4/21 19:02
 * @Author
 * @Project moocJAVA
 * @Class PersonTest
 * @Software IntelliJ IDEA
 * @Version
 */

package practice4.test;

import org.jetbrains.annotations.NotNull;
import practice4.anonymous.Person;

//import practice4.anonymous.Man;
//import practice4.anonymous.Woman;

public class PersonTest {
    //方案1

//    public void getRead(@NotNull Man man) {
//        man.read();
//    }
//
//    public void getRead(@NotNull Woman woman) {
//        woman.read();
//    }

    //方案2

    public void getRead(@NotNull Person obj) {
        obj.read();
    }

    public static void main(String[] args) {
        PersonTest test = new PersonTest();
//        Man one = new Man();
//        Woman two = new Woman();
//        test.getRead(one);
//        test.getRead(two);

        test.getRead(new Person() {

            @Override
            public void read() {
                System.out.println("男生喜欢看科幻类书籍");
            }
        });

        test.getRead(new Person() {
            @Override
            public void read() {
                System.out.println("女生喜欢看言情类书籍");
            }
        });
    }
}
