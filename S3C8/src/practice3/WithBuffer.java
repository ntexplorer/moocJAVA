package practice3;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Tian Z
 */
public class WithBuffer {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("S3C8\\src\\practice3\\two.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < 100000; i++) {
                bos.write('a');
            }
            long endTime = System.currentTimeMillis();
            System.out.println(endTime - startTime);
            bos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
