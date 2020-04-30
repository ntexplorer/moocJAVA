package exercise5;

import java.io.*;

/**
 * @author Tian Z
 */
public class BufferedDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("S3C8/src/exercise1/imooc.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            FileInputStream fis = new FileInputStream("S3C8/src/exercise1/imooc.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            bos.write(50);
            bos.write('a');
            bos.flush();

            System.out.println(bis.read());

            System.out.println((char) bis.read());

            fis.close();
            fos.close();
            bos.close();
            bis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
