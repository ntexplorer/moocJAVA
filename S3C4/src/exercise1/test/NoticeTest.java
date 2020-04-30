/**
 * @Time 2020/4/26 10:17
 * @Author
 * @Project moocJAVA
 * @Class NoticeTest
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise1.test;

import exercise1.model.Notice;

import java.util.ArrayList;
import java.util.Date;

public class NoticeTest {
    public static void main(String[] args) {
        Notice notice1 = new Notice(1, "Welcome to imooc", "admin", new Date());
        Notice notice2 = new Notice(2, "Please submit the coursework", "tutor", new Date());
        Notice notice3 = new Notice(3, "Attendance notice", "tutor", new Date());

        ArrayList<Notice> noticeList = new ArrayList<Notice>();
        noticeList.add(notice1);
        noticeList.add(notice2);
        noticeList.add(notice3);

        System.out.println("公告的内容为：");
        for (int i = 0; i < noticeList.size(); i++) {
            System.out.println((i + 1) + ":" + noticeList.get(i).getTitle());
        }

        Notice notice4 = new Notice(4, "Online Editor", "admin", new Date());
        System.out.println("**************");

        noticeList.add(1, notice4);
        System.out.println("添加后的公告为：");
        for (int i = 0; i < noticeList.size(); i++) {
            System.out.println((i + 1) + ":" + noticeList.get(i).getTitle());
        }

//        noticeList.remove(2);
        noticeList.remove(notice2);
        System.out.println("**************");

        System.out.println("删除后的公告为：");
        for (int i = 0; i < noticeList.size(); i++) {
            System.out.println((i + 1) + ":" + noticeList.get(i).getTitle());
        }
        System.out.println("**************");
        notice4.setTitle("Java online editor available");
        for (int i = 0; i < noticeList.size(); i++) {
            System.out.println((i + 1) + ":" + noticeList.get(i).getTitle());
        }

    }
}
