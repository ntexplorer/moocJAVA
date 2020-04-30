package exercise2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Tian Z
 */
public class FileInputDemo1 {
    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("S3C8\\src\\exercise2\\imooc.txt");
//            int n = fileInputStream.read();
//            while (n != -1) {
//                System.out.print((char) n);
//                n = fileInputStream.read();
//            }

            int n = 0;
            while ((n = fileInputStream.read()) != -1) {
                System.out.print((char) n);
            }

            System.out.println((char) n);
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
