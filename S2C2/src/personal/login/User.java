/**
 * @Time 2020/4/18 22:52
 * @Author Chuckie
 * @Project moocJAVA
 * @Class User
 * @Software IntelliJ IDEA
 * @Version 1.0
 */

package personal.login;

public class User {
    private final String username;
    private final String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
