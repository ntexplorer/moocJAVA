/**
 * @Time 2020/4/26 12:57
 * @Author
 * @Project moocJAVA
 * @Class Student
 * @Software IntelliJ IDEA
 * @Version
 */

package practice3.model;

import java.util.Objects;

public class Student {
    private int stuId;
    private String name;
    private float score;

    @Override
    public String toString() {
        return "[" +
                "学号：" + stuId +
                ", 姓名：" + name + '\'' +
                ", 成绩：" + score +
                ']';
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
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
        return stuId == student.stuId &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuId, name);
    }

    public Student(int stuId, String name, float score) {
        this.setStuId(stuId);
        this.setName(name);
        this.setScore(score);
    }

    public Student() {
    }
}
