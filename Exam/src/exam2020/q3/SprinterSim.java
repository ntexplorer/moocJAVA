package exam2020.q3;

/**
 * The type Sprinter simulator.
 *
 * @author Tian Z
 */
public class SprinterSim {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        final int SPRINTER_NUM = 8;
//        Create a new Thread array of 8 length
        SprinterThread[] sprinter = new SprinterThread[SPRINTER_NUM];
//        use for loop to create Thread and start them
        for (int i = 0; i < SPRINTER_NUM; i++) {
            sprinter[i] = new SprinterThread(i);
            sprinter[i].start();
        }
        try {
            for (int i = 0; i < SPRINTER_NUM; i++) {
                sprinter[i].join();
            }
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        int bestSprinter = -1;
        int bestTime = Integer.MAX_VALUE;

        for (int i = 0; i < SPRINTER_NUM; i++) {
            int t = sprinter[i].getTime();
            if (t < bestTime) {
                bestTime = t;
                bestSprinter = i;
            }
        }
        System.out.println("Winner is: Sprinter " + bestSprinter + "!");
    }
}
