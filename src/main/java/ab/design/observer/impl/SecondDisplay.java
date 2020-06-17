package ab.design.observer.impl;

import ab.design.observer.behaviour.DisplayElement;
import ab.design.observer.behaviour.Observer;
import ab.design.observer.behaviour.Subject;

public class SecondDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private float pressure;

    public SecondDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Second{" +
                           "temp=" + this.temp +
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

