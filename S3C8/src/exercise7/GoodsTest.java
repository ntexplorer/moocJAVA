package exercise7;

import java.io.*;

/**
 * @author Tian Z
 */
public class GoodsTest {
    public static void main(String[] args) {
        Goods goods1 = new Goods("gd001", "Computer", 3000);
        try {
            FileOutputStream fos = new FileOutputStream("S3C8\\src\\exercise7\\imooc.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            FileInputStream fis = new FileInputStream("S3C8\\src\\exercise7\\imooc.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
//            write info into txt
            oos.writeObject(goods1);
            oos.writeBoolean(true);
            oos.flush();

//            read obj from txt
            Goods goods = (Goods) ois.readObject();
            System.out.println(goods);
            System.out.println(ois.readBoolean());

            fos.close();
            oos.close();
            fis.close();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
