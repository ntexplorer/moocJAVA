package practice2.telephone;

/**
 * @author ntexp
 */
public interface Father {
    /**
     * doSomething;
     */
    void doSomething();

    /**
     * fly
     */
    default void fly() {
        System.out.println("fly2");
    }
}
