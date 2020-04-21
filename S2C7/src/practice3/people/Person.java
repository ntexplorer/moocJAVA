/**
 * @Time 2020/4/21 18:05
 * @Author
 * @Project moocJAVA
 * @Class Person
 * @Software IntelliJ IDEA
 * @Version
 */

package practice3.people;

public class Person {
    int age;
    static int age2 = 44;

    public Heart getHeart() {
        return new Heart();
    }

    public void eat() {
        System.out.println("People can eat.");
    }

    class Heart {
        int age = 13;

        public String beat() {
            eat();
            return "The heart of " + age + "  " + Person.this.age + " years old is beating.";
        }
    }

    static class Belly {
        int age = 10;
        int temp = 22;

        public String someFunc() {
            new Person().eat();
            System.out.println(Person.age2 + " years old belly.");
            return new Person().age + " years old belly.";

        }
    }
}
