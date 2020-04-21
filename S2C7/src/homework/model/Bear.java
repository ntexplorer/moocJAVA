/**
 * @Time 2020/4/21 19:50
 * @Author
 * @Project moocJAVA
 * @Class Bear
 * @Software IntelliJ IDEA
 * @Version
 */

package homework.model;

/**
 * The type Bear.
 */
public class Bear extends Animal implements IAct {
    /**
     * Instantiates a new Bear.
     */
    public Bear() {
    }

    /**
     * Instantiates a new Bear.
     *
     * @param name the name
     * @param age  the age
     */
    public Bear(String name, int age) {
        super(name, age);
    }

    @Override
    public String love() {
        return "喜欢卖萌";
    }

    @Override
    public String skill() {
        return "挽着花篮，打着雨伞，自立走秀";
    }

    @Override
    public String act() {

        return "表演者：" + this.getName() + "\n年龄：" + this.getAge() + "岁\n技能：" + this.skill() + "\n爱好：" + this.love();
    }
}
