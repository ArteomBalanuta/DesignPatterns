package ab.design.observer.impl;

import ab.design.observer.behaviour.DisplayElement;
import ab.design.observer.behaviour.Observer;
import ab.design.observer.behaviour.Subject;

public class FirstDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private float pressure;

    public FirstDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("FirstDisplay{" +
                           "temp=" + this.temp +
                           ", humidity=" + this.humidity +
                           ", pressure=" + this.pressure +
                           '}');
    }

    @Override
    public void update(
        float temp,
        float humidity,
        float pressure
    ) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
