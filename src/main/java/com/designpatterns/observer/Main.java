package com.designpatterns.observer;

import com.designpatterns.observer.classes.DisplayOne;
import com.designpatterns.observer.classes.DisplayTwo;
import com.designpatterns.observer.classes.WeatherData;

public class Main {

    public static void main(String[] args) {
        // emitter or "concrete subject"
        WeatherData weatherData = new WeatherData();
        // displays are the observers
        DisplayOne displayOne = new DisplayOne(weatherData);
        DisplayTwo displayTwo = new DisplayTwo(weatherData);

        //fires the event
        weatherData.whenStateChanges();
    }
}
