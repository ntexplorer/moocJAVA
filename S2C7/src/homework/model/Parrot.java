/**
 * @Time 2020/4/21 19:59
 * @Author
 * @Project moocJAVA
 * @Class Parrot
 * @Software IntelliJ IDEA
 * @Version
 */

package homework.model;

/**
 * The type Parrot.
 */
public class Parrot extends Animal implements IAct {
    private String type;

    /**
     * Instantiates a new Parrot.
     */
    public Parrot() {
    }

    /**
     * Instantiates a new Parrot.
     *
     * @param name the name
     * @param age  the age
     * @param type the type
     */
    public Parrot(String name, int age, String type) {
        super(name, age);
        this.setType(type);
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String love() {
        return "喜欢吃坚果和松子";
    }

    @Override
    public String skill() {
        return "擅长模仿";
    }

    @Override
    public String act() {

        return "表演者：" + this.getName() + "\n年龄：" + this.getAge() + "岁\n品种：" + this.getType()
                + "\n技能：" + this.skill() + "\n爱好：" + this.love();
    }
}
