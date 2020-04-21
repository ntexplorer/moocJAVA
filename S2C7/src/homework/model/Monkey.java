/**
 * @Time 2020/4/21 19:59
 * @Author
 * @Project moocJAVA
 * @Class Monkey
 * @Software IntelliJ IDEA
 * @Version
 */

package homework.model;

/**
 * The type Monkey.
 */
public class Monkey extends Animal implements IAct {
    private String type;

    /**
     * Instantiates a new Monkey.
     */
    public Monkey() {
    }

    /**
     * Instantiates a new Monkey.
     *
     * @param name the name
     * @param age  the age
     * @param type the type
     */
    public Monkey(String name, int age, String type) {
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
        return "喜欢模仿人的动作表情";
    }

    @Override
    public String skill() {
        return "骑独轮车过独木桥";
    }

    @Override
    public String act() {

        return "表演者：" + this.getName() + "\n年龄：" + this.getAge() + "岁\n品种：" + this.getType()
                + "\n技能：" + this.skill() + "\n爱好：" + this.love();
    }
}
