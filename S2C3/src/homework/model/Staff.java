/**
 * @Time 2020/4/19 16:02
 * @Author Tian
 * @Project moocJAVA
 * @Class Staff
 * @Software IntelliJ IDEA
 * @Version 1.0
 */

package homework.model;


/**
 * The type Staff.
 */
public class Staff {
    private String staffName;
    private String staffId;
    private String gender;
    private int age;
    private Department currentDept;
    private Position currentPos;

    /**
     * Instantiates a new Staff.
     */
    public Staff() {
    }

    /**
     * Instantiates a new Staff.
     *
     * @param staffName the staff name
     * @param staffId   the staff id
     * @param gender    the gender
     * @param age       the age
     */
    public Staff(String staffName, String staffId, String gender, int age) {
        this.setStaffName(staffName);
        this.setStaffId(staffId);
        this.setGender(gender);
        this.setAge(age);
    }

    /**
     * Instantiates a new Staff.
     *
     * @param staffName the staff name
     * @param staffId   the staff id
     * @param gender    the gender
     * @param age       the age
     * @param dept      the dept
     * @param pos       the pos
     */
    public Staff(String staffName, String staffId, String gender, int age, Department dept, Position pos) {
        this.setStaffName(staffName);
        this.setStaffId(staffId);
        this.setGender(gender);
        this.setAge(age);
        this.setCurrentDept(dept);
        this.setCurrentPos(pos);
    }

    /**
     * Gets current pos.
     *
     * @return the current pos
     */
    public Position getCurrentPos() {
        return currentPos;
    }

    /**
     * Sets current pos.
     *
     * @param currentPos the current pos
     */
    public void setCurrentPos(Position currentPos) {
        this.currentPos = currentPos;
    }

    /**
     * Gets current dept.
     *
     * @return the current dept
     */
    public Department getCurrentDept() {
        return currentDept;
    }

    /**
     * Sets current dept.
     *
     * @param currentDept the current dept
     */
    public void setCurrentDept(Department currentDept) {
        this.currentDept = currentDept;
    }

    /**
     * Gets staff name.
     *
     * @return the staff name
     */
    public String getStaffName() {
        return staffName;
    }

    /**
     * Sets staff name.
     *
     * @param staffName the staff name
     */
    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    /**
     * Gets staff id.
     *
     * @return the staff id
     */
    public String getStaffId() {
        return staffId;
    }

    /**
     * Sets staff id.
     *
     * @param staffId the staff id
     */
    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    /**
     * Gets gender.
     *
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets gender.
     *
     * @param gender the gender
     */
    public void setGender(String gender) {
        String defaultGender1 = "男";
        String defaultGender2 = "女";
        if (gender.equals(defaultGender1) || gender.equals(defaultGender2)) {
            this.gender = gender;
        } else {
            this.gender = "男";
//            错误输入默认赋值为“男”
        }
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
        int ageMin = 18;
        int ageMax = 65;
        if (age <= ageMin || age >= ageMax) {
            this.age = 18;
        } else {
            this.age = age;
        }
    }

    /**
     * Show staff info string.
     *
     * @return the staff information
     */
    public String showStaffInfo() {
        return "姓名：" + this.getStaffName() + "\n工号：" + this.getStaffId() + "\n性别：" + this.getGender()
                + "\n年龄：" + this.getAge() + "\n职务：" + this.getCurrentDept().getDeptName()
                + this.getCurrentPos().getPosName() + "\n=============================";
    }
}
