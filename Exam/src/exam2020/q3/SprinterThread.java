package exam2020.q3;

/**
 * The type Sprinter thread.
 *
 * @author Tian Z
 */
public class SprinterThread extends Thread {
    private final int ID;
    private int time = 0;

    /**
     * Instantiates a new Sprinter thread.
     *
     * @param id the id
     */
    public SprinterThread(int id) {
        ID = id;
    }

    /**
     * Gets time.
     *
     * @return the time
     */
    public int getTime() {
        return time;
    }

    @Override
    public void run() {
//        total distance of 10000cm
        final int totalDistance = 10000;
        int distanceFinished = 0;
//        forward from 180cm to 250cm distance
        int maxDistanceStep = 250;
        int minDistanceStep = 180;
//        time step from 14ms to 18ms
        int maxTimeStep = 18;
        int minTimeStep = 14;

        while (distanceFinished < totalDistance) {
            int distanceStep = minDistanceStep + (int) (Math.random() * (maxDistanceStep - minDistanceStep + 1));
            distanceFinished += distanceStep;
            int timeStep = minTimeStep + (int) (Math.random() * (maxTimeStep - minTimeStep + 1));
            time += timeStep;
            try {
                Thread.sleep(timeStep);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.println("Sprinter " + ID + " finished " + distanceStep + " distance using " + timeStep + " time;");
        }

        System.out.println("Sprinter " + ID + " finished at time " + time + ".");
    }
}
