package exam2020.q1;

/**
 * @author Tian Z
 */
public class Values {
    public static void main(String[] args) {
        double s = 2.7;
        double t = 3.2;
        int i = 2;
        double r1 = (int) s / i + t;
        double r2 = s + i * t;
        String r3 = s + "+" + (i * t);
        StringBuffer buf = new StringBuffer(r3);
        buf.insert(2, "$");
        buf.replace(5, 7, "#");
        String r4 = buf.toString();

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);
    }
}
