package practice5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Tian Z
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Product iphone = new Product(123, "iPhone", "telephone", 4888);
        Product ipad = new Product(234, "iPad", "computer", 5088);
        Product macbook = new Product(345, "macBook", "computer", 10688);
        Product iwatch = new Product(256, "iWatch", "watch", 4799);

        File file = new File("S3C8\\src\\practice5\\product.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        FileOutputStream fos = new FileOutputStream("S3C8\\src\\practice5\\product.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        List<Product> list = new ArrayList<>();

        list.add(iphone);
        list.add(ipad);
        list.add(macbook);
        list.add(iwatch);

        for (Product product : list) {
            oos.writeObject(product);
        }
        oos.flush();

        FileInputStream fis = new FileInputStream("S3C8\\src\\practice5\\product.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        System.out.println("apple系列产品信息：");
        Product product = (Product) ois.readObject();
        System.out.println(product);
        Product product1 = (Product) ois.readObject();
        System.out.println(product1);
        Product product2 = (Product) ois.readObject();
        System.out.println(product2);
        Product product3 = (Product) ois.readObject();
        System.out.println(product3);

        oos.close();
        fos.close();
        ois.close();
        fis.close();
    }
}
