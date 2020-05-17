package homework;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tian Z
 */
public class Class {
    private String classId;
    private String className;
    private List<Student> studentList;

    @Override
    public String toString() {
        return "班级信息：" +
                "[班级编号：" + classId + '，' +
                "班级名称：" + className + ']';
    }

    public float getChineseAverage() {
        float sum = 0;
        for (Student student : this.studentList) {
            sum += student.getChineseScore();
        }
        return sum / studentList.size();
    }

    public float getMathAverage() {
        float sum = 0;
        for (Student student : this.studentList) {
            sum += student.getMathScore();
        }
        return sum / studentList.size();
    }

    public Class(String classId, String className) {
        this.classId = classId;
        this.className = className;
        this.studentList = new ArrayList<>();
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student) {
        boolean flag = false;
        for (Student student1 : this.studentList) {
            if (student1.equals(student)) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("该学号已存在！");
        } else {
            this.studentList.add(student);
        }
    }

    public Student searchStudentById(String studentId) {
        for (Student student : this.studentList) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    public void insertChineseScore(String studentId, float score) {
        boolean flag = false;
        for (Student student : this.studentList) {
            if (student.getStudentId().equals(studentId)) {
                flag = true;
                student.setChineseScore(score);
                break;
            }
        }
        if (!flag) {
            System.out.println("学号 " + studentId + " 不存在！无法添加语文成绩！");
        }
    }

    public void insertMathScore(String studentId, float score) {
        boolean flag = false;
        for (Student student : this.studentList) {
            if (student.getStudentId().equals(studentId)) {
                flag = true;
                student.setMathScore(score);
                break;
            }
        }
        if (!flag) {
            System.out.println("学号 " + studentId + " 不存在！无法添加数学成绩！");
        }
    }

    public void deleteStudent(String studentId) {
        boolean flag = false;
        for (Student student : this.studentList) {
            if (student.getStudentId().equals(studentId)) {
                flag = true;
                this.studentList.remove(student);
                System.out.println("删除操作成功！");
                break;
            }
        }
        if (!flag) {
            System.out.println("删除操作失败，学生不存在！");
        }
    }

    public void displayAllStudent() {
        if (!this.studentList.isEmpty()) {
            System.out.println(this.getClassName() + "班级列表：");
            for (Student student : this.studentList) {
                System.out.println(student);
            }
        } else {
            System.out.println("班级为空！");
        }
    }

    public float getAverageChineseScore() {
        float sum = 0f;
        for (Student student : this.studentList) {
            sum += student.getChineseScore();
        }
        return sum / this.studentList.size();
    }

    public float getAverageMathScore() {
        float sum = 0f;
        for (Student student : this.studentList) {
            sum += student.getMathScore();
        }
        return sum / this.studentList.size();
    }

}
