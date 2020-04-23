package practice.test;

import java.util.Scanner;

/**
 * @author ntexp
 */
public class TryDemo4 {
    public static void main(String[] args) {
        try {
            testAge();
        } catch (HotelAgeException e) {
            System.out.println(e.getMessage());
            System.out.println("Can not register");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testAge() throws Exception {
        System.out.println("Please enter the age: ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        int min = 18;
        int max = 80;

//        try {
//            if (age < min || age > max) {
//                throw new Exception("Must have company!");
//            } else {
//                System.out.println("Welcome to the hotel.");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("???");
//        }

        if (age < min || age > max) {
            throw new HotelAgeException();
        } else {
            System.out.println("Welcome to the hotel.");
        }
    }
}
