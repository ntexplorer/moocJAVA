/**
 * @Time 2020/4/26 13:00
 * @Author
 * @Project moocJAVA
 * @Class StudentTest
 * @Software IntelliJ IDEA
 * @Version
 */

package practice3.test;

import practice3.model.Student;

import java.util.HashSet;

public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student(1, "Tom", 87.0f);
        Student stu2 = new Student(2, "Lucy", 95.0f);
        Student stu3 = new Student(3, "William", 65.0f);
        HashSet<Student> studentHashSet = new HashSet<>();
        studentHashSet.add(stu3);
        studentHashSet.add(stu1);
        studentHashSet.add(stu2);

        Student stu4 = new Student(1, "Tom", 55.0f);
        studentHashSet.add(stu4);

        for (Student student : studentHashSet) {
            System.out.println(student);
        }

    }
}
