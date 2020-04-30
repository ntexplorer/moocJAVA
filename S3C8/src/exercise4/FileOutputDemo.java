package exercise4;

import java.io.*;

/**
 * @author Tian Z
 */
public class FileOutputDemo {
    public static void main(String[] args) {
        File file;
        try {
            FileInputStream fis = new FileInputStream("S3C8\\src\\exercise4\\1.gif");
            FileOutputStream fos = new FileOutputStream("S3C8\\src\\exercise4\\1-2.gif");
            int n = 0;
            byte[] b = new byte[1024];
            while ((n = fis.read(b)) != -1) {
                fos.write(b, 0, n);
            }
            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
