package practice3;

import java.util.Random;

/**
 * @author Tian Z
 */
public class Weather {
    private int temperature;
    private int humidity;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    private boolean flag = false;

    public synchronized void generate() {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setTemperature(new Random().nextInt(40));
        this.setHumidity(new Random().nextInt(100));
        System.out.println("生成天气数据[温度：" + this.getTemperature() + "，湿度：" + this.getHumidity() + "]");
        flag = true;
        notifyAll();
    }

    public synchronized void read() {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("读取天气数据[温度：" + this.getTemperature() + "，湿度：" + this.getHumidity() + "]");
        flag = false;
        notifyAll();
    }

}
