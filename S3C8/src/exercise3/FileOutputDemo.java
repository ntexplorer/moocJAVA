package exercise3;

import java.io.*;

/**
 * @author Tian Z
 */
public class FileOutputDemo {
    public static void main(String[] args) {
        File file = new File("S3C8\\src\\exercise3\\imooc.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileOutputStream fos;
        FileInputStream fis;
        try {
            fos = new FileOutputStream("S3C8\\src\\exercise3\\imooc.txt");
            fos.write(50);
            fos.write('a');
            fis = new FileInputStream("S3C8\\src\\exercise3\\imooc.txt");
            System.out.println(fis.read());
            System.out.println((char) fis.read());
            fos.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
