/**
 * @Time 2020/4/27 10:33
 * @Author
 * @Project moocJAVA
 * @Class StringSort
 * @Software IntelliJ IDEA
 * @Version
 */

package practice1;

import java.util.ArrayList;
import java.util.List;

public class StringSort {
    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();
        wordList.add("orange");
        wordList.add("tomato");
        wordList.add("apple");
        wordList.add("litchi");
        wordList.add("banana");
        System.out.println("排序前：");
        for (int i = 0; i < wordList.size(); i++) {
            System.out.print(wordList.get(i) + "  ");
        }
        System.out.println();
        wordList.sort(null);
        System.out.println("排序后：");
        for (int i = 0; i < wordList.size(); i++) {
            System.out.print(wordList.get(i) + "  ");
        }
    }
}
