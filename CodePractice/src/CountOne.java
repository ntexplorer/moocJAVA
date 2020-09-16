import java.util.Scanner;

/**
 * @author Tian Z
 */
public class CountOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int count = 0;
            String str = Integer.toBinaryString(scanner.nextInt());

            for (int i = 0; i < str.length(); i++) {
                int a = Integer.parseInt(str.substring(i, i + 1));
                if (a == 1) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
