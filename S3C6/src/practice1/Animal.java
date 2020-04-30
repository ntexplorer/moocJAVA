/**
 * @Time 2020/4/27 17:23
 * @Author
 * @Project moocJAVA
 * @Class Animal
 * @Software IntelliJ IDEA
 * @Version
 */

package practice1;

/**
 * The type Animal.
 */
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.setName(name);
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Play game.
     */
    public abstract void playGame();
}
