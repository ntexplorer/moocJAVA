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
            System.out.println("Student ID already exists!");
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
            System.out.println("Student " + studentId + " doesn't exist! Chinese");
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
            System.out.println("Student " + studentId + " doesn't exist! Math");
        }
    }

    public void deleteStudent(String studentId) {
        boolean flag = false;
        for (Student student : this.studentList) {
            if (student.getStudentId().equals(studentId)) {
                flag = true;
                this.studentList.remove(student);
                System.out.println("Deletion successful!");
                break;
            }
        }
        if (!flag) {
            System.out.println("Fail to delete a student which doesn't exist!");
        }
    }

    public void displayAllStudent() {
        for (Student student : this.studentList) {
            System.out.println(student);
        }
    }

}
