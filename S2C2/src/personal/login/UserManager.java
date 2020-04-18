/**
 * @Time 2020/4/18 22:52
 * @Author Chuckie
 * @Project moocJAVA
 * @Class UserManager
 * @Software IntelliJ IDEA
 * @Version 1.0
 */

package personal.login;

public class UserManager {
    public String checkUser(User one, User two) {
        System.out.println("用户名：" + one.getUsername());
        System.out.println("密码：" + one.getPassword());
        System.out.println("用户名：" + two.getUsername());
        System.out.println("密码：" + two.getPassword());
        System.out.println("==============");
        String result;
        if (one.getUsername().equals(two.getUsername()) && one.getPassword().equals(two.getPassword())) {
            result = "用户名和密码一致";
        } else {
            result = "用户名或密码不一致";
        }
        return result;
    }
}