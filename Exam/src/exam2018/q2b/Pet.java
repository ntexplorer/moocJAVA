package exam2018.q2b;

/**
 * @author ntexp
 */
public interface Pet {
    /**
     * This method is for the pet to eat
     *
     * @return eat food
     */
    String eat();

    /**
     * This method is for the pet to make sound
     *
     * @return for pet to talk
     */
    String talk();

    /**
     * This method is the rewriting of the toString method
     *
     * @return toString of the Pet
     */
    @Override
    String toString();
}
