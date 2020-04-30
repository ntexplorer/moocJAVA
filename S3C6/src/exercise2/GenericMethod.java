/**
 * @Time 2020/4/27 17:48
 * @Author
 * @Project moocJAVA
 * @Class GenericMethod
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise2;

public class GenericMethod {
    public <T extends Number> void printValue(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        Integer integer = 5;
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.printValue(integer);
    }
}
