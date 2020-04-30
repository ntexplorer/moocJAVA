package practice3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Tian Z
 */
public class WithoutBuffer {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("S3C8\\src\\practice3\\one.txt");
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < 100000; i++) {
                fos.write('a');
            }
            long endTime = System.currentTimeMillis();
            fos.close();
            System.out.println(endTime - startTime);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
