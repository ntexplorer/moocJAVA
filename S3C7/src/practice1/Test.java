/**
 * @Time 2020/4/27 23:26
 * @Author
 * @Project moocJAVA
 * @Class Test
 * @Software IntelliJ IDEA
 * @Version
 */

package practice1;

class Cat implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + "A cat");
        }
    }
}

class Dog implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + "A dog");
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        Runnable target;
        Thread thread = new Thread(cat1);
        Thread thread1 = new Thread(dog1);
        thread.start();
        thread1.start();
        for (int i = 0; i < 3; i++) {
            System.out.println("Main thread");
        }
    }
}
