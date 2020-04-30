/**
 * @Time 2020/4/27 11:02
 * @Author
 * @Project moocJAVA
 * @Class Student
 * @Software IntelliJ IDEA
 * @Version
 */

package practice2;

public class Student {
    private int studentId;
    private String studentName;
    private int studentAge;

    @Override
    public String toString() {
        return "[" +
                "学号：" + studentId +
                ", 年龄：'" + studentAge + '\'' +
                ", 姓名：" + studentName +
                ']';
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public Student(int studentId, String studentName, int studentAge) {
        this.setStudentAge(studentAge);
        this.setStudentId(studentId);
        this.setStudentName(studentName);
    }
}
