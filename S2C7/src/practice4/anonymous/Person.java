/**
 * @Time 2020/4/21 19:00
 * @Author
 * @Project moocJAVA
 * @Class Person
 * @Software IntelliJ IDEA
 * @Version
 */

package practice4.anonymous;

public abstract class Person {
    private String name;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void read();
}
