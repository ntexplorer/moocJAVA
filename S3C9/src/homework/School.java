package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Tian Z
 */
public class School {
    private Map<String, Class> schoolMap;
    private Map<String, Student> studentMap;


    public School() {
        this.schoolMap = new HashMap<>();
        this.studentMap = new HashMap<>();
    }

    public void setSchoolMap(Map<String, Class> schoolMap) {
        this.schoolMap = schoolMap;
    }

    public Map<String, Class> getSchoolMap() {
        return schoolMap;
    }

    public Map<String, Student> getStudentMap() {
        return studentMap;
    }

    public void setStudentMap(Map<String, Student> studentMap) {
        this.studentMap = studentMap;
    }

    public void addClass(Class newClass) {
        if (this.schoolMap.containsKey(newClass.getClassName())) {
            System.out.println("班级已存在！");
        } else {
            this.schoolMap.put(newClass.getClassName(), newClass);
            System.out.println("添加成功");
        }
    }

    public void deleteClass(String targetClass) {
        if (this.schoolMap.containsKey(targetClass)) {
            this.schoolMap.remove(targetClass);
            System.out.println("删除成功");
        } else {
            System.out.println("班级不存在");
        }
    }

    public Class searchByClassName(String className) {
        return this.schoolMap.getOrDefault(className, null);
    }

    public void sortChineseByAverage() {
        List<Class> chineseList = new ArrayList<>(this.schoolMap.values());
        if (!chineseList.isEmpty()) {
            chineseList.sort(new ChineseComparator());
            System.out.println("按语文成绩排序后： ");
            for (Class aClass : chineseList) {
                System.out.println(aClass.getClassName() + "语文成绩：" + aClass.getChineseAverage());
            }
        } else {
            System.out.println("还未向班级中添加学生");
        }

    }

    public void sortMathByAverage() {
        List<Class> mathList = new ArrayList<>(this.schoolMap.values());
        if (!mathList.isEmpty()) {
            mathList.sort(new MathComparator());
            System.out.println("按据数学成绩排序后： ");
            for (Class aClass : mathList) {
                System.out.println(aClass.getClassName() + "数学成绩：" + aClass.getMathAverage());
            }
            System.out.println();
        } else {
            System.out.println("还未向班级中添加学生");
        }
    }

    public void displayClassName() {
        System.out.println("显示所有班级名称");
        System.out.println("所有的班级名称为：");
        for (Class aClass : this.schoolMap.values()) {
            System.out.println(aClass.getClassName());
        }
    }

    public void addStudent(String studentId, Student student) {
        this.studentMap.put(studentId, student);
        System.out.println("学生添加成功");
    }

    public void displayAllStudent() {
        System.out.println("主学生列表学生信息：");
        for (Student student : studentMap.values()) {
            System.out.println(student);
        }
    }

}
