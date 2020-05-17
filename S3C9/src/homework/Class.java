package homework;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Class.
 *
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

    /**
     * Gets chinese average.
     *
     * @return the chinese average
     */
    public float getChineseAverage() {
        float sum = 0;
        for (Student student : this.studentList) {
            sum += student.getChineseScore();
        }
        return sum / studentList.size();
    }

    /**
     * Gets math average.
     *
     * @return the math average
     */
    public float getMathAverage() {
        float sum = 0;
        for (Student student : this.studentList) {
            sum += student.getMathScore();
        }
        return sum / studentList.size();
    }

    /**
     * Instantiates a new Class.
     *
     * @param classId   the class id
     * @param className the class name
     */
    public Class(String classId, String className) {
        this.classId = classId;
        this.className = className;
        this.studentList = new ArrayList<>();
    }

    /**
     * Gets class id.
     *
     * @return the class id
     */
    public String getClassId() {
        return classId;
    }

    /**
     * Sets class id.
     *
     * @param classId the class id
     */
    public void setClassId(String classId) {
        this.classId = classId;
    }

    /**
     * Gets class name.
     *
     * @return the class name
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets class name.
     *
     * @param className the class name
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * Gets student list.
     *
     * @return the student list
     */
    public List<Student> getStudentList() {
        return studentList;
    }

    /**
     * Sets student list.
     *
     * @param studentList the student list
     */
    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    /**
     * Add student.
     *
     * @param student the student
     */
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

    /**
     * Search student by id student.
     *
     * @param studentId the student id
     * @return the student
     */
    public Student searchStudentById(String studentId) {
        for (Student student : this.studentList) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    /**
     * Insert chinese score.
     *
     * @param studentId the student id
     * @param score     the score
     */
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

    /**
     * Insert math score.
     *
     * @param studentId the student id
     * @param score     the score
     */
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

    /**
     * Delete student.
     *
     * @param studentId the student id
     */
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

    /**
     * Display all student.
     */
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

    /**
     * Gets average chinese score.
     *
     * @return the average chinese score
     */
    public float getAverageChineseScore() {
        float sum = 0f;
        for (Student student : this.studentList) {
            sum += student.getChineseScore();
        }
        return sum / this.studentList.size();
    }

    /**
     * Gets average math score.
     *
     * @return the average math score
     */
    public float getAverageMathScore() {
        float sum = 0f;
        for (Student student : this.studentList) {
            sum += student.getMathScore();
        }
        return sum / this.studentList.size();
    }

}
