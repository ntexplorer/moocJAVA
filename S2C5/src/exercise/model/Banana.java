/**
 * @Time 2020/4/20 19:29
 * @Author
 * @Project moocJAVA
 * @Class Banana
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise.model;

public class Banana extends Fruits {
    private final String variety;

    public Banana(String shape, String taste, String variety) {
        super(shape, taste);
        this.variety = variety;
    }

    public void advantage() {
        System.out.println(this.variety + "果形" + this.getShape() + "，果肉香甜，可供生食。");
    }

    public void advantage(String color) {
        System.out.println(this.variety + "颜色为" + color);
    }
}
