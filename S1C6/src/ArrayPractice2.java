/**
 * @Time : 2020/4/14 12:07
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : ArrayPractice2
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class ArrayPractice2 {
    public static void main(String[] args) {
        char[] charArr = {'a', 'b', 'c', 'd', 'e', 'f', 'a', 'A', 'A'};
        int count = 0;
        for (char value : charArr) {
            if (value == 'a' || value == 'A') {
                count += 1;
            }
        }
        System.out.println("The number of 'a' and 'A' shown in the array is " + count);
    }
}
