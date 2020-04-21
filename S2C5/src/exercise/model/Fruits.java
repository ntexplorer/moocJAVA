/**
 * @Time 2020/4/20 19:19
 * @Author
 * @Project moocJAVA
 * @Class Fruits
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise.model;

public class Fruits {
    private String shape;
    private String taste;

    public Fruits() {
    }

    public Fruits(String shape, String taste) {
        this.shape = shape;
        this.taste = taste;
    }

    public void eat() {
        System.out.println("水果可供人们食用！");
    }

    public boolean equals(Fruits obj) {
        if (obj == null) {
            return false;
        }

        return this.shape.equals(obj.shape) && (this.taste.equals(obj.taste));
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}
