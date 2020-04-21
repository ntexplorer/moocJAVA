/**
 * @Time 2020/4/21 19:55
 * @Author
 * @Project moocJAVA
 * @Class Lion
 * @Software IntelliJ IDEA
 * @Version
 */

package homework.model;

/**
 * The type Lion.
 *
 * @author T
 */
public class Lion extends Animal implements IAct {
    private String color;
    private String sex;

    /**
     * Instantiates a new Lion.
     */
    public Lion() {
    }

    /**
     * Instantiates a new Lion.
     *
     * @param name  the name
     * @param age   the age
     * @param color the color
     * @param sex   the sex
     */
    public Lion(String name, int age, String color, String sex) {
        super(name, age);
        this.setColor(color);
        this.setSex(sex);
    }

    /**
     * Gets color.
     *
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets color.
     *
     * @param color the color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Gets sex.
     *
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets sex.
     *
     * @param sex the sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String love() {
        return "喜欢吃各种肉类";
    }

    @Override
    public String skill() {
        return "擅长钻火圈";
    }

    @Override
    public String act() {

        return "表演者：" + this.getName() + "\n年龄：" + this.getAge() + "岁\n性别：" + this.getSex() + "\n毛色：" + this.getColor()
                + "\n技能：" + this.skill() + "\n爱好：" + this.love();

    }
}
