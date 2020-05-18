package exam2020.q1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * The type Student account collection.
 *
 * @author Tian Z
 */
public class StudentAccountCollection {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        String[] accounts = {"c1111111", "c2222222", "c3333333", "c4444444", "c5555555"};
        boolean found = false;
        String query = "c1111111";
//        Use a HashSet to store all the Strings
        Set<String> accountSet = new HashSet<>(Arrays.asList(accounts));
        if (accountSet.contains(query)) {
            found = true;
        }
        System.out.println("Variable found is " + found);
    }
}
