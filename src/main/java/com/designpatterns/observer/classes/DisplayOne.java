package com.designpatterns.observer.classes;

import com.designpatterns.observer.interfaces.Observer;

/**
 * This class represents an Observer.
 */
public class DisplayOne implements Observer {
    WeatherData weatherData;

    public DisplayOne(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(int data) {
        System.out.printf("%s have received data: %d%n", DisplayOne.class.getName(), data);
    }
}
