/**
 * @Time 2020/4/27 11:05
 * @Author
 * @Project moocJAVA
 * @Class StudentTest
 * @Software IntelliJ IDEA
 * @Version
 */

package practice2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentTest implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        String name1 = o1.getStudentName();
        String name2 = o2.getStudentName();
        return name1.compareTo(name2);
    }

    public static void main(String[] args) {
        Student student1 = new Student(40, "Peter", 20);
        Student student2 = new Student(28, "Angel", 5);
        Student student3 = new Student(35, "Tom", 18);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        System.out.println("按姓名排序前：");
        for (Student student : studentList) {
            System.out.println(student);
        }

        studentList.sort(new StudentTest());
        System.out.println("按姓名排序后：");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
