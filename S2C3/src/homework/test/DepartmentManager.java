/**
 * @Time 2020/4/19 16:41
 * @Author Tian
 * @Project moocJAVA
 * @Class DepartmentManager
 * @Software IntelliJ IDEA
 * @Version 1.0
 */

package homework.test;

import homework.model.Department;
import homework.model.Position;
import homework.model.Staff;

public class DepartmentManager {
    public static void main(String[] args) {
        Staff staff1 = new Staff("张铭", "S001", "男", 29);
        Staff staff2 = new Staff("李艾爱", "S002", "女", 21);
        Staff staff3 = new Staff("孙超", "S003", "男", 29);
        Staff staff4 = new Staff("张美美", "S004", "女", 26);
        Staff staff5 = new Staff("蓝迪", "S005", "男", 37);
        Staff staff6 = new Staff("米莉", "S006", "女", 24);
        Department dept1 = new Department("D001", "人事部");
        Department dept2 = new Department("D002", "市场部");
        Position position1 = new Position("P001", "经理");
        Position position2 = new Position("P002", "助理");
        Position position3 = new Position("P003", "职员");

        dept1.addStaff(staff1);
        dept1.addStaff(staff2);
        dept1.addStaff(staff3);
        dept2.addStaff(staff4);
        dept2.addStaff(staff5);
        dept2.addStaff(staff6);

        staff1.setCurrentPos(position1);
        staff2.setCurrentPos(position2);
        staff3.setCurrentPos(position3);
        staff4.setCurrentPos(position3);
        staff5.setCurrentPos(position1);
        staff6.setCurrentPos(position3);

        System.out.println(staff1.showStaffInfo());
        System.out.println(staff2.showStaffInfo());
        System.out.println(staff3.showStaffInfo());
        System.out.println(staff4.showStaffInfo());
        System.out.println(staff5.showStaffInfo());
        System.out.println(staff6.showStaffInfo());
        System.out.println(dept1.showDept());
        System.out.println(dept2.showDept());
    }

}
