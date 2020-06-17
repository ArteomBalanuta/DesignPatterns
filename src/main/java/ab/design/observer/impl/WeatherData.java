package ab.design.observer.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ab.design.observer.behaviour.Observer;
import ab.design.observer.behaviour.Subject;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i > 0) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers){
            o.update(this.temp, this.humidity, this.pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(){
        Random r = new Random();
        this.temp = r.nextFloat()*50;
        this.humidity = r.nextFloat()*10;
        this.pressure = r.nextFloat()*2;
        measurementsChanged();
    }

}
