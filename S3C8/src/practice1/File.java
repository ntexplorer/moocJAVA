package practice1;

import java.io.IOException;

/**
 * @author Tian Z
 */
public class File {
    public static void main(String[] args) {
        java.io.File file1 = new java.io.File("D:\\Project\\moocJAVA\\S3C8\\src\\practice1\\Monday.docx");
        if (!file1.exists()) {
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("文件名称：" + file1.getName());
            System.out.println("文件上一级目录：" + file1.getParent());
            System.out.print("文件/目录：这是一个");
            if (file1.isDirectory()) {
                System.out.print("目录");
                System.out.println();
            } else if (file1.isFile()) {
                System.out.print("文件");
                System.out.println();
            } else {
                System.out.println("既不是目录也不是文件");
            }
            System.out.print("读写性：");
            if (file1.canRead() && file1.canWrite()) {
                System.out.print("这个文件既可以读还可以写");
                System.out.println();
            } else if (file1.canRead()) {
                System.out.print("这个文件可读");
                System.out.println();
            } else if (file1.canWrite()) {
                System.out.print("这个文件可写");
                System.out.println();
            } else {
                System.out.println("这个文件不可以读也不可以写");
            }
        }
    }
}
