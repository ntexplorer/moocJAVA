package exercise2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Tian Z
 */
public class FileInputDemo2 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("S3C8\\src\\exercise2\\imooc.txt");
            byte[] b = new byte[100];
            fileInputStream.read(b, 0, 5);
            System.out.println(new String(b));
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
