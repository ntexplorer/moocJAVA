/**
 * @Time 2020/4/20 18:33
 * @Author
 * @Project moocJAVA
 * @Class Test
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise3.test;

import exercise3.model.Person;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("李明", 18, "男");
        System.out.println(person);
        System.out.println(person.toString());

        Person.a = "bb";
        System.out.println(Person.a);

        person.test();
    }
}
