package practice3;

/**
 * @author Tian Z
 */
public class WeatherTest {
    public static void main(String[] args) {
        Weather weather = new Weather();
        Thread thread1 = new Thread(new GenerateWeather(weather));
        Thread thread2 = new Thread(new ReadWeather(weather));
        thread1.start();
        thread2.start();
    }
}
