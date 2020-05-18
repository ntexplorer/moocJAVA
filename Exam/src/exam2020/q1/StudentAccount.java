package exam2020.q1;

/**
 * The type Student account.
 *
 * @author Tian Z
 */
public class StudentAccount {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        String[] accounts = {"c1111111", "c2222222", "c3333333", "c4444444", "c5555555"};
        boolean found = false;
        String query = "c1111111";
        for (String account : accounts) {
            if (account.equals(query)) {
                found = true;
                break;
            }
        }
        System.out.println("Variable found is " + found);
    }
}
