/**
 * @Time 2020/4/27 11:37
 * @Author
 * @Project moocJAVA
 * @Class EmployeeTest
 * @Software IntelliJ IDEA
 * @Version
 */

package practice3;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("emp001", "张三", 1800.0f);
        Employee employee2 = new Employee("emp002", "李四", 2500.0f);
        Employee employee3 = new Employee("emp003", "王五", 1600.0f);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        System.out.println("排序前：");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

        employeeList.sort(Employee::compareTo);
        System.out.println("排序后：");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
