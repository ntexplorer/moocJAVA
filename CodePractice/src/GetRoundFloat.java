import java.util.Scanner;

/**
 * @author Tian Z
 */
public class GetRoundFloat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(Math.round(scanner.nextDouble()));
        }
    }
}
