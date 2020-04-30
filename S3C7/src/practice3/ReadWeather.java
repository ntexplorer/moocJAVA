package practice3;

/**
 * @author Tian Z
 */
public class ReadWeather implements Runnable {
    Weather weather;
    private int i = 1;

    public ReadWeather(Weather weather) {
        this.weather = weather;
    }

    @Override
    public void run() {
        while (i <= 100) {
            weather.read();
            i++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
