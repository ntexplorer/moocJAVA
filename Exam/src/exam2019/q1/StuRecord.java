package exam2019.q1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

/**
 * @author Tian Z
 */
public class StuRecord {
    private int studentNumber;
    private String studentForename;
    private double marks;

    public StuRecord() {

    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentForename() {
        return studentForename;
    }

    public void setStudentForename(String studentForename) {
        this.studentForename = studentForename;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Name: " + this.getStudentForename() + " " + this.getStudentNumber() + " " + this.getMarks();
    }

    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader("Exam/src/exam2019/q1/stu.txt");
        Scanner scanner = new Scanner(fileReader);
        List<String> strList = new ArrayList<>();
        Map<String, StuRecord> stuMap = new HashMap<>(5);
        while (scanner.hasNextLine()) {
            strList.add(scanner.nextLine());
        }

        for (int i = 0; i < strList.size(); i++) {
            if (i % 3 == 0) {
                StuRecord student = new StuRecord();
                student.setStudentNumber(Integer.parseInt(strList.get(i)));
                student.setStudentForename(strList.get(i + 1));
                student.setMarks(Double.parseDouble(strList.get(i + 2)));
                stuMap.put(strList.get(i + 1), student);
            }
        }

//        for (String key: stuMap.keySet()){
//            System.out.println(key);
//        }
//        for (StuRecord student:stuMap.values()){
//            System.out.println(student);
//        }

        for (String arg : args) {
            if (stuMap.containsKey(arg)) {
                System.out.println(stuMap.get(arg));
            } else {
                System.out.println("Name: " + arg + " N/A");
            }
        }

    }
}
