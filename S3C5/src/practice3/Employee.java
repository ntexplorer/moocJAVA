package practice3;

/**
 * @author Tian
 */
public class Employee implements Comparable<Employee> {
    private String employeeId;
    private String name;
    private float salary;

    @Override
    public String toString() {
        return "员工[" +
                "编号：" + employeeId +
                ", 姓名：" + name +
                ", 工资：" + salary +
                ']';
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Employee(String employeeId, String name, float salary) {
        this.setEmployeeId(employeeId);
        this.setName(name);
        this.setSalary(salary);
    }

    @Override
    public int compareTo(Employee o) {
        float salary1 = this.getSalary();
        float salary2 = o.getSalary();
        return (int) (salary2 - salary1);
    }
}
