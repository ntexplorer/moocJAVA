/**
 * @Time 2020/4/21 19:47
 * @Author T
 * @Project moocJAVA
 * @Class Animal
 * @Software IntelliJ IDEA
 * @Version 1.0
 */

package homework.model;

/**
 * The type Animal.
 */
public abstract class Animal {
    private String name;
    private int age;

    /**
     * Instantiates a new Animal.
     */
    public Animal() {
    }

    /**
     * Instantiates a new Animal.
     *
     * @param name the name
     * @param age  the age
     */
    public Animal(String name, int age) {
        this.setName(name);
        this.setAge(age);
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
     * Gets age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Describe the animal's info
     *
     * @return the string
     */
    public abstract String love();
}
