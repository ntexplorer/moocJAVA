package exercise;

import java.io.File;
import java.io.IOException;

/**
 * @author Tian Z
 */
public class FileDemo {
    public static void main(String[] args) {
//        File file1 = new File("D:\\Project\\moocJAVA\\S3C8\\src\\io\\Score.txt");
//        File file1 = new File("D:\\Project\\moocJAVA", "S3C8\\src\\io");
        File file1 = new File("D:\\Project\\moocJAVA\\S3C8\\src\\io");
        File file2 = new File(file1, "Score.txt");
        System.out.println(file2.isFile());
        System.out.println(file2.isDirectory());

        File file3 = new File("D:\\Project\\moocJAVA\\S3C8\\src\\set\\HashSet");
        if (!file3.exists()) {
            file3.mkdirs();
        }

        File file4 = new File("D:\\Project\\moocJAVA\\S3C8\\src\\io\\Score2.txt");
        if (!file4.exists()) {
            try {
                file4.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
