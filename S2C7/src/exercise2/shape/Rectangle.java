/**
 * @Time 2020/4/21 15:27
 * @Author
 * @Project moocJAVA
 * @Class Rectangle
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise2.shape;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.setLength(length);
        this.setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return this.getLength() * this.getWidth();
    }
}
