import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Tian Z
 */
public class CountBottle {
    public static int getBottleNum(int input) {
        int maxBottleNum = 100;
        int bottleDrunk = 0;
        int bottleLeft = input;
        int bottleTraded = input / 3;

        if (input <= maxBottleNum && input >= 0) {
            while (bottleTraded > 0) {
                bottleDrunk += bottleTraded;
                bottleLeft = bottleLeft % 3 + bottleTraded;
                bottleTraded = bottleLeft / 3;
            }
            if (bottleLeft == 2) {
                bottleDrunk += 1;
            }
            return bottleDrunk;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int temp = scanner.nextInt();
            if (temp != 0) {
                list.add(temp);
            } else {
                break;
            }
        }
        for (int i : list) {
            System.out.println(getBottleNum(i));
        }
    }
}
