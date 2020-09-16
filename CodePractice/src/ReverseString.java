import java.util.Scanner;

/**
 * @author Tian Z
 */
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String originalStr = scanner.nextLine();
            String newStr = new StringBuffer(originalStr).reverse().toString();
            System.out.println(newStr);
        }
    }
}
