package homework;

import java.util.Objects;

/**
 * @author Tian Z
 */
public class Student {
    private String studentId;
    private String studentName;
    private float chineseScore;
    private float mathScore;

    public String getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "学生信息： [学号：" + this.getStudentId() + "，学生姓名：" + this.getStudentName() + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, studentName);
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public float getChineseScore() {
        return chineseScore;
    }

    public void setChineseScore(float chineseScore) {
        this.chineseScore = chineseScore;
    }

    public float getMathScore() {
        return mathScore;
    }

    public void setMathScore(float mathScore) {
        this.mathScore = mathScore;
    }

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }
}
