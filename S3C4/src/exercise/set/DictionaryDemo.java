/**
 * @Time 2020/4/26 13:27
 * @Author
 * @Project moocJAVA
 * @Class DictionaryDemo
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise.set;

import java.util.*;

public class DictionaryDemo {
    public static void main(String[] args) {
        Map<String, String> animal = new HashMap<>(3);
        System.out.println("请输入三组单词对应的注释，并存放到HashMap中");
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int max = 3;
        while (i < max) {
            System.out.println("请输入key值：");
            String key = sc.nextLine();
            System.out.println("请输入value值：");
            String value = sc.nextLine();
            animal.put(key, value);
            i++;
        }

        System.out.println("***************");
        System.out.println("使用迭代器输出所有value");
        Iterator<String> iterator = animal.values().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        System.out.println("***************");
        System.out.println("通过EntrySet方法得到键值对");
        Set<Map.Entry<String, String>> entrySet = animal.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        System.out.println("***************");
        System.out.println("请输入要查找的键：");
        String strSearch = sc.nextLine();
        Set<String> keySet = animal.keySet();
        boolean flag = false;
        String key = null;
        for (String j : keySet) {
            if (j.equals(strSearch)) {
                flag = true;
                key = j;
                break;
            }
        }
        if (flag) {
            System.out.println("Found! " + "key-value:" + key + "-" + animal.get(key));
        } else {
            System.out.println("Not found!");
        }
    }
}
