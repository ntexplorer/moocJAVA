package exam2018.q3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Tian Z
 */
public class Find {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Two arguments expected!");
            System.exit(1);
        }
        try {
            FileReader reader = new FileReader(args[0]);
            Scanner scanner = new Scanner(reader);
            int count = 0;
            while (scanner.hasNextLine()) {
                String nextName = scanner.nextLine();
                if (nextName.equalsIgnoreCase(args[1])) {
                    System.out.println(nextName);
                    count += 1;
                }
            }
            if (count == 0) {
                System.out.println("No Name Found!");
            }
            scanner.close();
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
