/**
 * @Time 2020/4/20 19:23
 * @Author
 * @Project moocJAVA
 * @Class Waxberry
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise.model;

public final class Waxberry extends Fruits {
    private final String color;

    public Waxberry(String shape, String taste, String color) {
        super(shape, taste);
        this.color = color;
    }

    public final void face() {
        System.out.println("杨梅:" + this.color + "、" + this.getShape() + "，果味酸甜适中。");
    }

    @Override
    public void eat() {
        System.out.println("杨梅酸甜适中，非常好吃！");
    }

    @Override
    public String toString() {
        return "杨梅的信息：果实为" + this.getShape() + "、" + this.color + "，" + this.getTaste() + "，非常好吃！";
    }
}
