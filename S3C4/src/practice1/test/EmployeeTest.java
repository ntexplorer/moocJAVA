/**
 * @Time 2020/4/26 10:28
 * @Author
 * @Project moocJAVA
 * @Class EmployeeTest
 * @Software IntelliJ IDEA
 * @Version
 */

package practice1.test;

import practice1.model.Employee;

import java.util.ArrayList;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "张三", 5000.0);
        Employee employee2 = new Employee(2, "李四", 5500.0);
        Employee employee3 = new Employee(3, "赵六", 6000.0);
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        System.out.println("员工姓名   员工薪资");
        for (Employee employee : employeeList) {
            System.out.println(employee.getName() + "     " + employee.getSalary());
        }
    }
}
