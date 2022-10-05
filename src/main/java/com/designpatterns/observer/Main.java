package com.designpatterns.observer;

import com.designpatterns.observer.classes.DisplayOne;
import com.designpatterns.observer.classes.DisplayTwo;
import com.designpatterns.observer.classes.WeatherData;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        DisplayOne displayOne = new DisplayOne(weatherData);
        DisplayTwo displayTwo = new DisplayTwo(weatherData);

        weatherData.whenStateChanges();
    }
}
