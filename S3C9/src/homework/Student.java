package homework;

import java.util.Objects;

/**
 * The type Student.
 *
 * @author Tian Z
 */
public class Student {
    private String studentId;
    private String studentName;
    private float chineseScore;
    private float mathScore;

    /**
     * Gets student id.
     *
     * @return the student id
     */
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

    /**
     * Sets student id.
     *
     * @param studentId the student id
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * Gets student name.
     *
     * @return the student name
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * Sets student name.
     *
     * @param studentName the student name
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * Gets chinese score.
     *
     * @return the chinese score
     */
    public float getChineseScore() {
        return chineseScore;
    }

    /**
     * Sets chinese score.
     *
     * @param chineseScore the chinese score
     */
    public void setChineseScore(float chineseScore) {
        this.chineseScore = chineseScore;
    }

    /**
     * Gets math score.
     *
     * @return the math score
     */
    public float getMathScore() {
        return mathScore;
    }

    /**
     * Sets math score.
     *
     * @param mathScore the math score
     */
    public void setMathScore(float mathScore) {
        this.mathScore = mathScore;
    }

    /**
     * Instantiates a new Student.
     *
     * @param studentId   the student id
     * @param studentName the student name
     */
    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }
}
