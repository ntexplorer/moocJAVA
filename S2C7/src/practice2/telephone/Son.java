package practice2.telephone;

/**
 * @author ntexp
 */
public interface Son extends Father, Father2 {
    /**
     * run
     */
    void run();

    /**
     * new fly
     */
    @Override
    default void fly() {
        System.out.println("new fly");
    }
}
