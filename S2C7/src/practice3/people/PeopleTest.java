/**
 * @Time 2020/4/21 18:07
 * @Author
 * @Project moocJAVA
 * @Class PeopleTest
 * @Software IntelliJ IDEA
 * @Version
 */

package practice3.people;

public class PeopleTest {
    public static void main(String[] args) {
        Person lili = new Person();
        lili.age = 12;
//method 1
        Person.Heart myHeart = new Person().new Heart();
        System.out.println(myHeart.beat());

//        method 2
        myHeart = lili.new Heart();
        System.out.println(myHeart.beat());

        myHeart = lili.getHeart();
        System.out.println(myHeart.beat());

//        Person.Heart newHeart = new Person.Heart();

        Person.Belly myBelly = new Person.Belly();
        System.out.println(myBelly.someFunc());
    }
}
