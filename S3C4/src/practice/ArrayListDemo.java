/**
 * @Time 2020/4/26 10:07
 * @Author
 * @Project moocJAVA
 * @Class ArrayListDemo
 * @Software IntelliJ IDEA
 * @Version
 */

package practice;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("语文");
        list.add("数学");
        list.add("英语");
        list.add("物理");
        list.add("化学");
        list.add("生物");
        System.out.println("列表中元素的个数为: " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println("第" + (i + 1) + "个元素为" + list.get(i));
        }
    }
}
