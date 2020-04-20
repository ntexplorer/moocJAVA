/**
 * @Time 2020/4/19 16:17
 * @Author Tian
 * @Project moocJAVA
 * @Class Department
 * @Software IntelliJ IDEA
 * @Version 1.0
 */

package homework.model;

public class Department {
    private String deptId;
    private String deptName;
    private Staff[] staffArr;
    private int staffNum;

    /**
     * 不带参的构造方法
     */
    public Department() {
    }

    /**
     * 带部门ID和部门名的构造方法
     *
     * @param deptId   部门ID
     * @param deptName 部门名称
     */
    public Department(String deptId, String deptName) {
        this.setDeptId(deptId);
        this.setDeptName(deptName);
    }

    /**
     * 可以直接添加员工数组的构造方法
     *
     * @param deptId   部门ID
     * @param deptName 部门名
     * @param staffArr 员工数组
     */
    public Department(String deptId, String deptName, Staff[] staffArr) {
        this.setDeptId(deptId);
        this.setDeptName(deptName);
        this.setStaffArr(staffArr);
    }

    /**
     * @return 部门ID
     */
    public String getDeptId() {
        return deptId;
    }

    /**
     * @param deptId 部门ID
     */
    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    /**
     * @return 部门名
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * @param deptName 部门名称
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * @return 员工数组
     */
    public Staff[] getStaffArr() {
        return staffArr;
    }

    /**
     * @param staffArr 员工数组
     */
    public void setStaffArr(Staff[] staffArr) {
        this.staffArr = staffArr;
    }

    /**
     * @return 部门员工数量
     */
    public int getStaffNum() {
        return staffNum;
    }

    /**
     * @param staff 员工对象
     */
    public void addStaff(Staff staff) {
        if (this.staffArr == null) {
            this.staffArr = new Staff[50];
        }
        for (int i = 0; i < this.staffArr.length; i++) {
            if (this.staffArr[i] == null) {
                this.staffArr[i] = staff;
                staff.setCurrentDept(this);
                this.staffNum = i + 1;
                break;
            }
        }
    }

    /**
     * @return 返回部门信息
     */
    public String showDept() {
        return this.getDeptName() + "总共有" + this.getStaffNum() + "名员工";
    }

}
