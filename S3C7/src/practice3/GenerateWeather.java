package practice3;

/**
 * @author Tian Z
 */
public class GenerateWeather implements Runnable {
    Weather weather;
    int i = 1;

    public GenerateWeather(Weather weather) {
        this.weather = weather;
    }

    @Override
    public void run() {
        while (i <= 100) {
            weather.generate();
            i++;
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
