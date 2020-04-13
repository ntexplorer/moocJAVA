import java.util.Scanner;

/**
 * @Time : 2020/4/13 15:28
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : WeekDemo2
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class WeekDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the word for each day: ");
        String day = sc.nextLine();
        day = day.toUpperCase();
        switch (day) {
            case "MONDAY":
                System.out.println(1);
                break;
            case "TUESDAY":
                System.out.println(2);
                break;
            case "WEDNESDAY":
                System.out.println(3);
                break;
            case "THURSDAY":
                System.out.println(4);
                break;
            case "FRIDAY":
                System.out.println(5);
                break;
            case "SATURDAY":
                System.out.println(6);
                break;
            case "SUNDAY":
                System.out.println(7);
                break;
            default:
                System.out.println("Invalid Word!");
        }
    }
}
