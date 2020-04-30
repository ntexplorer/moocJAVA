package homework;

/**
 * @author Tian Z
 */
public class TestDemo {
    public static void main(String[] args) {
        TestDemo td = new TestDemo();
        td.testClass();
        System.out.println("#########################");
        td.testSchool();
        System.out.println("#########################");

    }

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
        school1.deleteClass(class2);
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

    public void mainMenu() {

    }

    public void schoolMenu() {

    }

    public void classMenu() {

    }

    public void test() {

    }
}
