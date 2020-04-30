package practice2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Tian Z
 */
public class FileInput {
    public static void main(String[] args) {
        File file;
        int count = 0;
        try {
            FileInputStream fis = new FileInputStream("S3C8\\src\\practice2\\speech.txt");
            int n = 0;
            System.out.print("文本内容：");
            while ((n = fis.read()) != -1) {
                System.out.print((char) n);
                count++;
            }
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("统计结果：speech.txt文件中共有" + count + "个字节");

        System.out.println("***********************");
        int j;
        List<Character> charList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("S3C8\\src\\practice2\\speech.txt");
            while ((j = fis.read()) != -1) {
                charList.add((char) j);
            }
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("文本内容：");
        for (int i = 0; i < charList.size(); i++) {
            System.out.print(charList.get(i));
        }
        System.out.println();
        System.out.println("统计结果：speech.txt文件中共有" + charList.size() + "个字节");

    }
}
