package practice4;

import java.io.*;

/**
 * @author Tian Z
 */
public class Practice {
    public void transWriteByBuf() throws IOException {
        File file = new File("S3C8\\src\\practice4\\test.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fw = new FileWriter("S3C8\\src\\practice4\\test.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("你好吗？\n");
        bw.write("我很好！");
        bw.close();
        fw.close();
    }

    public void transReadByBuf() throws IOException {
        File file;
        FileReader fr = new FileReader("S3C8\\src\\practice4\\test.txt");
        BufferedReader br = new BufferedReader(fr);
        while (br.ready()) {
            System.out.println(br.readLine());
        }
        br.close();
        fr.close();
    }

    public static void main(String[] args) throws IOException {
        Practice practice = new Practice();
        practice.transWriteByBuf();
        practice.transReadByBuf();
    }
}
