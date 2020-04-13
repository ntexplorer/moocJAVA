import java.util.Scanner;

/**
 * @Time : 2020/4/12 23:00
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : LeapYear
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Please enter a year: ");
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        boolean condition1 = year % 4 == 0;
        boolean condition2 = year % 100 != 0;
        boolean condition3 = year % 400 == 0;
        if ((condition1 && condition2) || condition3) {
            System.out.println("The year " + year + " is a leap year.");
        } else {
            System.out.println("The year " + year + " is not a leap year.");
        }
    }
}
