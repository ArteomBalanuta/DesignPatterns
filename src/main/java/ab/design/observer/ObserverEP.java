package ab.design.observer;

import ab.design.observer.impl.FirstDisplay;
import ab.design.observer.impl.SecondDisplay;
import ab.design.observer.impl.WeatherData;

public class ObserverEP {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        ab.design.observer.behaviour.Observer firstDisplay = new FirstDisplay(weatherData);
        ab.design.observer.behaviour.Observer secondDisplay = new SecondDisplay(weatherData);

        weatherData.setMeasurements();
        weatherData.setMeasurements();
    }
}
