/**
 * @Time 2020/4/19 16:37
 * @Author Tian
 * @Project moocJAVA
 * @Class Position
 * @Software IntelliJ IDEA
 * @Version 1.0
 */

package homework.model;

public class Position {
    private String posId;
    private String posName;

    /**
     * 无参数构造方法
     */
    public Position() {
    }

    /**
     * @param posId   职位ID
     * @param posName 职位名
     */
    public Position(String posId, String posName) {
        this.posId = posId;
        this.posName = posName;
    }

    /**
     * @return 职位ID
     */
    public String getPosId() {
        return posId;
    }

    /**
     * @param posId 职位ID
     */
    public void setPosId(String posId) {
        this.posId = posId;
    }

    /**
     * @return 职位名称
     */
    public String getPosName() {
        return posName;
    }

    /**
     * @param posName 职位名称
     */
    public void setPosName(String posName) {
        this.posName = posName;
    }
}
