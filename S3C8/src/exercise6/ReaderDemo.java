package exercise6;

import java.io.*;

/**
 * @author Tian Z
 */
public class ReaderDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("S3C8\\src\\exercise6\\imooc.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            FileOutputStream fos = new FileOutputStream("S3C8\\src\\exercise6\\imooc1.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);

            int n = 0;
            char[] cbuf = new char[10];

//            while ((n=isr.read())!=-1){
//                System.out.print((char)n);
//            }

//            while ((n=isr.read(cbuf))!=-1){
//                String s = new String(cbuf,0,n);
//                System.out.println(s);
//            }

            while ((n = isr.read(cbuf)) != -1) {
                osw.write(cbuf, 0, n);
                osw.flush();
            }

            fis.close();
            fos.close();
            isr.close();
            osw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
