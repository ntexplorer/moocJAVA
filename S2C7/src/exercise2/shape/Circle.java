/**
 * @Time 2020/4/21 15:25
 * @Author
 * @Project moocJAVA
 * @Class Circle
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise2.shape;

public class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.setR(r);
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return this.getR() * this.getR() * Math.PI;
    }
}
