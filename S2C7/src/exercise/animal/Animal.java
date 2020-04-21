/**
 * @Time 2020/4/21 14:42
 * @Author
 * @Project moocJAVA
 * @Class Animal
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise.animal;

public class Animal {
    private String kind;

    public Animal() {
    }

    public Animal(String kind) {
        this.setKind(kind);
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void cry() {
        System.out.println("?");
    }
}
