package homework;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The type Test demo.
 *
 * @author Tian Z
 */
public class TestDemo {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        TestDemo td = new TestDemo();
//        td.testClass();
//        System.out.println("#########################");
//        td.testSchool();
//        System.out.println("#########################");

        td.test();
    }

    /**
     * Test class.
     */
    public void testClass() {
        Student student1 = new Student("S001", "Tom");
        Student student2 = new Student("S002", "Jack");
        Student student3 = new Student("S003", "Amy");
        Student student4 = new Student("S004", "David");
        Student student5 = new Student("S001", "Luke");
        Class class1 = new Class("C001", "CMT101");
        class1.addStudent(student1);
        class1.addStudent(student2);
        class1.addStudent(student3);
        class1.addStudent(student4);
        class1.addStudent(student5);
        System.out.println("************************");
        System.out.println(class1.searchStudentById("S003"));
        System.out.println(class1.searchStudentById("S006"));
        System.out.println("************************");
        class1.insertChineseScore("S001", 99.0f);
        class1.insertChineseScore("S002", 88.0f);
        class1.insertChineseScore("S003", 77.0f);
        class1.insertChineseScore("S004", 66.0f);
        class1.insertChineseScore("S005", 55.0f);
        System.out.println("************************");
        class1.insertMathScore("S001", 98.0f);
        class1.insertMathScore("S002", 77.0f);
        class1.insertMathScore("S003", 66.0f);
        class1.insertMathScore("S004", 44.0f);
        class1.insertMathScore("S008", 92.0f);
        System.out.println("************************");
        class1.deleteStudent("S004");
        class1.deleteStudent("S007");
        System.out.println("************************");
        class1.displayAllStudent();
        System.out.println("************************");
    }

    /**
     * Test school.
     */
    public void testSchool() {
        Student student1 = new Student("S001", "Tom");
        Student student2 = new Student("S002", "Jack");
        Student student3 = new Student("S003", "Amy");
        Student student4 = new Student("S004", "David");
        Student student5 = new Student("S005", "Peter");
        Student student6 = new Student("S006", "Tony");
        Student student7 = new Student("S007", "Shawn");
        Student student8 = new Student("S008", "Sam");
        Student student9 = new Student("S009", "Jimmy");
        Student student10 = new Student("S010", "Kim");
        Student student11 = new Student("S011", "Howard");
        Student student12 = new Student("S012", "Chuck");

        Class class1 = new Class("C001", "CMT101");
        Class class2 = new Class("C002", "CMT102");
        Class class3 = new Class("C003", "CMT103");

        class1.addStudent(student1);
        class1.addStudent(student2);
        class1.addStudent(student3);
        class1.addStudent(student4);

        class2.addStudent(student5);
        class2.addStudent(student6);
        class2.addStudent(student7);
        class2.addStudent(student8);

        class3.addStudent(student9);
        class3.addStudent(student10);
        class3.addStudent(student11);
        class3.addStudent(student12);

        class1.insertChineseScore("S001", 99.0f);
        class1.insertChineseScore("S002", 98.0f);
        class1.insertChineseScore("S003", 97.0f);
        class1.insertChineseScore("S004", 96.0f);

        class1.insertMathScore("S001", 11.0f);
        class1.insertMathScore("S002", 22.0f);
        class1.insertMathScore("S003", 33.0f);
        class1.insertMathScore("S004", 13.0f);

        class2.insertChineseScore("S005", 59.0f);
        class2.insertChineseScore("S006", 58.0f);
        class2.insertChineseScore("S007", 57.0f);
        class2.insertChineseScore("S008", 56.0f);

        class2.insertMathScore("S005", 66.0f);
        class2.insertMathScore("S006", 77.0f);
        class2.insertMathScore("S007", 57.0f);
        class2.insertMathScore("S008", 56.0f);

        class3.insertChineseScore("S009", 79.0f);
        class3.insertChineseScore("S010", 78.0f);
        class3.insertChineseScore("S011", 77.0f);
        class3.insertChineseScore("S012", 76.0f);

        class3.insertMathScore("S009", 99.0f);
        class3.insertMathScore("S010", 98.0f);
        class3.insertMathScore("S011", 97.0f);
        class3.insertMathScore("S012", 96.0f);

        School school1 = new School();
        school1.addClass(class1);
        school1.addClass(class2);
        school1.addClass(class3);
        school1.addClass(class3);
        System.out.println("*********************");
        school1.displayClassName();
        System.out.println("*********************");
        school1.deleteClass("C002");
        school1.displayClassName();
        school1.addClass(class2);
        System.out.println("*********************");
        System.out.println(school1.searchByClassName("CMT101"));
        System.out.println(school1.searchByClassName("C001"));
        System.out.println("*********************");
        school1.sortChineseByAverage();
        System.out.println("*********************");
        school1.sortMathByAverage();
    }

    /**
     * Main menu.
     *
     * @param school the school
     */
    public void mainMenu(School school) {
        System.out.println("************************");
        System.out.println("     ** 主菜单 **    ");
        System.out.println("     1--班级管理");
        System.out.println("     2--学校管理");
        System.out.println("     0--退出");
        System.out.println("************************");
        System.out.println("请输入对应数字进行列表管理：");
        Scanner mainScanner = new Scanner(System.in);
        try {
            int input = mainScanner.nextInt();
            switch (input) {
                case 1: {
                    schoolMenu(school);
                    break;
                }
                case 2: {
                    classMenu(school);
                    break;
                }
                case 0: {
                    System.out.println("程序结束！");
                    break;
                }
                default: {
                    System.out.println("无效的输入，请重试");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("异常输入，请重试！");
            String input = mainScanner.nextLine();
            mainMenu(school);
        }
    }

    /**
     * School menu.
     *
     * @param school the school
     */
    public void schoolMenu(School school) {
        do {
            System.out.println("************************");
            System.out.println("     ** 学校管理 **    ");
            System.out.println("     1--创建班级");
            System.out.println("     2--删除班级");
            System.out.println("     3--通过班级名称查询班级信息");
            System.out.println("     4--对各班语文成绩按平均分进行由大到小排序 ");
            System.out.println("     5--对各班数学成绩按平均分进行由大到小排序 ");
            System.out.println("     6--显示所有班级名称 ");
            System.out.println("     9--返回上一级菜单 ");
            System.out.println("************************");
            System.out.println("请输入对应数字进行学校列表管理");
            Scanner schoolScanner = new Scanner(System.in);
            try {
                int input = schoolScanner.nextInt();
                switch (input) {
                    case 1: {
                        System.out.println("向学校中添加班级");
                        System.out.println("请输入班级编号：");
                        String classId = schoolScanner.next();
                        System.out.println("请输入班级名称：");
                        String className = schoolScanner.next();
                        Class newClass = new Class(classId, className);
                        school.addClass(newClass);
                        break;
                    }
                    case 2: {
                        System.out.println("从学校中删除班级");
                        System.out.println("请输入班级名称");
                        String className = schoolScanner.next();
                        school.deleteClass(className);
                        break;
                    }
                    case 3: {
                        System.out.println("通过班级名称查询班级");
                        System.out.println("请输入班级名称");
                        String className = schoolScanner.next();
                        Class classFound = school.searchByClassName(className);
                        if (classFound != null) {
                            System.out.println(classFound);
                        } else {
                            System.out.println("班级不存在");
                        }
                        break;
                    }
                    case 4: {
                        school.sortChineseByAverage();
                        break;
                    }
                    case 5: {
                        school.sortMathByAverage();
                        break;
                    }
                    case 6: {
                        school.displayClassName();
                        break;
                    }
                    case 9: {
                        mainMenu(school);
                        break;
                    }
                    default:
                        System.out.println("无效的输入，请重试");
                }
            } catch (InputMismatchException e) {
                System.out.println("异常输入，请重试！");
                String input = schoolScanner.nextLine();
                schoolMenu(school);
            }

        } while (true);
    }

    /**
     * Class menu.
     *
     * @param school the school
     */
    public void classMenu(School school) {
        do {
            System.out.println("************************");
            System.out.println("     ** 班级管理 **    ");
            System.out.println("     1--添加学生信息到主学生列表");
            System.out.println("     2--添加学生信息到普通班级");
            System.out.println("     3--通过学号查询学生信息");
            System.out.println("     4--输入班级的语文成绩 ");
            System.out.println("     5--输入班级的数学成绩 ");
            System.out.println("     6--删除学生信息 ");
            System.out.println("     7--显示所有学生信息 ");
            System.out.println("     9--返回上一级菜单 ");
            System.out.println("************************");
            System.out.println("请输入对应数字进行班级列表管理");
            Scanner classScanner = new Scanner(System.in);
            try {
                int input = classScanner.nextInt();
                switch (input) {
                    case 1: {
                        System.out.println("添加学生到主学生列表");
                        System.out.println("请输入添加的学生数量：");
                        int number = Integer.parseInt(classScanner.next());
                        for (int i = 0; i < number; i++) {
                            System.out.println("请输入第" + (i + 1) + "个学生信息");
                            System.out.println("请输入学生编号：");
                            String studentId = classScanner.next();
                            System.out.println("请输入学生姓名：");
                            String studentName = classScanner.next();
                            Student newStudent = new Student(studentId, studentName);
                            school.addStudent(studentId, newStudent);
                        }
                        System.out.println("主学生列表的学生信息为：");
                        school.displayAllStudent();
                        break;
                    }
                    case 2: {
                        System.out.println("添加学生信息到普通班级");
                        System.out.println("请输入要添加的班级名称");
                        String className = classScanner.next();
                        Class selectedClass = null;
                        for (String name : school.getSchoolMap().keySet()) {
                            if (name.equals(className)) {
                                selectedClass = school.getSchoolMap().get(name);
                                break;
                            }
                        }
                        if (selectedClass != null) {
                            System.out.println("请输入要添加的学生个数：");
                            int studentNumber = classScanner.nextInt();
                            for (int i = 0; i < studentNumber; i++) {
                                System.out.println("请输入第" + (i + 1) + "个学生信息");
                                System.out.println("请输入要添加的学生id：");
                                String studentId = classScanner.next();
                                Student selectedStudent = null;
                                for (String id : school.getStudentMap().keySet()) {
                                    if (id.equals(studentId)) {
                                        selectedStudent = school.getStudentMap().get(id);
                                        break;
                                    }
                                }
                                if (selectedStudent != null) {
                                    selectedClass.addStudent(selectedStudent);
                                    System.out.println("添加成功");
                                } else {
                                    System.out.println("学生不存在，请重试");
                                }
                            }
                        } else {
                            System.out.println("班级不存在!");
                        }
                        school.displayAllStudent();
                        if (selectedClass != null) {
                            selectedClass.displayAllStudent();
                        }
                        break;
                    }
                    case 3: {
                        System.out.println("通过学号查询学生信息：");
                        System.out.println("请输入学号：");
                        String studentId = classScanner.next();
                        Student selectedStudent = null;
                        for (String id : school.getStudentMap().keySet()) {
                            if (id.equals(studentId)) {
                                selectedStudent = school.getStudentMap().get(id);
                                break;
                            }
                        }
                        if (selectedStudent != null) {
                            System.out.println(selectedStudent);
                        } else {
                            System.out.println("学生不存在");
                        }
                        break;
                    }
                    case 4: {
                        System.out.println("输入班级的语文成绩");
                        System.out.println("输入班级的名称");
                        String className = classScanner.next();
                        Class selectedClass = null;
                        for (String name : school.getSchoolMap().keySet()) {
                            if (name.equals(className)) {
                                selectedClass = school.getSchoolMap().get(name);
                                break;
                            }
                        }
                        if (selectedClass != null) {
                            for (Student student : selectedClass.getStudentList()) {
                                System.out.println(student);
                                System.out.println("请输入语文成绩：");
                                float chineseScore = classScanner.nextFloat();
                                student.setChineseScore(chineseScore);
                                System.out.println("添加语文成绩成功");
                            }
                        } else {
                            System.out.println("班级不存在");
                        }
                        break;
                    }
                    case 5: {
                        System.out.println("输入班级的数学成绩");
                        System.out.println("输入班级的名称");
                        String className = classScanner.next();
                        Class selectedClass = null;
                        for (String name : school.getSchoolMap().keySet()) {
                            if (name.equals(className)) {
                                selectedClass = school.getSchoolMap().get(name);
                                break;
                            }
                        }
                        if (selectedClass != null) {
                            for (Student student : selectedClass.getStudentList()) {
                                System.out.println(student);
                                System.out.println("请输入数学成绩：");
                                float mathScore = classScanner.nextFloat();
                                student.setMathScore(mathScore);
                                System.out.println("添加数学成绩成功");
                            }
                        } else {
                            System.out.println("班级不存在");
                        }
                        break;
                    }
                    case 6: {
                        System.out.println("删除学生信息");
                        System.out.println("输入班级的名称");
                        String className = classScanner.next();
                        Class selectedClass = null;
                        for (String name : school.getSchoolMap().keySet()) {
                            if (name.equals(className)) {
                                selectedClass = school.getSchoolMap().get(name);
                                break;
                            }
                        }
                        if (selectedClass != null) {
                            System.out.println("请输入学生编号");
                            String studentId = classScanner.next();
                            selectedClass.deleteStudent(studentId);
                        }
                        break;
                    }
                    case 7: {
                        System.out.println("按班级显示学生信息");
                        System.out.println("请输入班级名称");
                        String className = classScanner.next();
                        Class selectedClass = null;
                        for (String name : school.getSchoolMap().keySet()) {
                            if (name.equals(className)) {
                                selectedClass = school.getSchoolMap().get(name);
                                break;
                            }
                        }
                        if (selectedClass != null) {
                            selectedClass.displayAllStudent();
                        } else {
                            System.out.println("班级不存在！");
                        }
                        break;
                    }
                    case 9: {
                        mainMenu(school);
                        break;
                    }
                    default: {

                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("异常输入，请重试！");
                String input = classScanner.nextLine();
                classMenu(school);
            }

        } while (true);

    }

    /**
     * Test.
     */
    public void test() {
        School school = new School();
        mainMenu(school);
    }
}
