package string;

/**
 * @author ntexp
 */
public class StringDemo2 {
    public static void main(String[] args) {
        String str = "JAVA programming basic, I love JAVA programming.";
        int a = str.indexOf('a');
        System.out.println("The index of the first 'a' shown in str is " + a);
        int b = str.indexOf("programming");
        System.out.println("The index of the first \"programming\" shown in str is " + b);

        int c = str.lastIndexOf('i');
        System.out.println("The last index of 'i' shown in str is " + c);
        int d = str.lastIndexOf("JAVA");
        System.out.println("The index of the last \"JAVA\" shown in str is " + d);

        int e = str.indexOf("programming", 7);
        System.out.println("The index of the first \"programming\" from the 8th index shown in str is " + e);

    }
}
