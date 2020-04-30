/**
 * @Time 2020/4/27 17:39
 * @Author
 * @Project moocJAVA
 * @Class NumGeneric
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise2;

/**
 * The type Num generic.
 *
 * @param <T> the type parameter
 */
public class NumGeneric<T> {
    private T num;

    /**
     * Gets num.
     *
     * @return the num
     */
    public T getNum() {
        return num;
    }

    /**
     * Sets num.
     *
     * @param num the num
     */
    public void setNum(T num) {
        this.num = num;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        NumGeneric<Integer> intNum = new NumGeneric<>();
        intNum.setNum(10);
        System.out.println(intNum.getNum());

        NumGeneric<Float> floatNumGeneric = new NumGeneric<>();
        floatNumGeneric.setNum(12.4f);
        System.out.println(floatNumGeneric.getNum());
    }
}
