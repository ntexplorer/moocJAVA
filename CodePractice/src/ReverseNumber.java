import java.util.Scanner;

/**
 * @author Tian Z
 */
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            String originalStr = scanner.nextLine();
            String newStr = new StringBuffer(originalStr).reverse().toString();
            System.out.println(newStr);
        }
    }
}
