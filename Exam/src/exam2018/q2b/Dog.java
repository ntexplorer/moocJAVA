package exam2018.q2b;

/**
 * @author Tian Z
 */
public class Dog implements Pet {
    public Dog() {
    }

    @Override
    public String eat() {
        return "The dog is eating food";
    }

    @Override
    public String talk() {
        return "The dog is sparking!";
    }
}
