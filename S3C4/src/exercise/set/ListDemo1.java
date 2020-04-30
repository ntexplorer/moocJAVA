/**
 * @Time 2020/4/26 9:58
 * @Author
 * @Project moocJAVA
 * @Class ListDemo1
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise.set;

import java.util.ArrayList;

public class ListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("C");
        list.add("C++");
        list.add("Go");
        list.add("swift");
        System.out.println("The number of the elements in the list is: " + list.size());
        System.out.println("**************************");
        for (String s : list) {
            System.out.print(s + "  ");
        }
        System.out.println();
        System.out.println("**************************");
        list.remove("C++");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

    }
}
