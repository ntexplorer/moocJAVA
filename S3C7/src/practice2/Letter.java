/**
 * @Time 2020/4/28 10:43
 * @Author
 * @Project moocJAVA
 * @Class Letter
 * @Software IntelliJ IDEA
 * @Version
 */

package practice2;

class LetterThread implements Runnable {
    private final char[] letter = new char[26];

    public LetterThread() {
        for (int i = 97; i <= 122; i++) {
            letter[i - 97] = (char) i;
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < letter.length; i++) {
            System.out.println(letter[i]);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/**
 * @author ntexp
 */
public class Letter {
    public static void main(String[] args) {
        LetterThread letterThread = new LetterThread();
        Thread t = new Thread(letterThread);
        t.start();
    }
}
