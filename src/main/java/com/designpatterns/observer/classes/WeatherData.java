package com.designpatterns.observer.classes;

import com.designpatterns.observer.interfaces.Observer;
import com.designpatterns.observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * This class represents our "Concrete Subject" object
 */
public class WeatherData implements Subject {
    List<Observer> observerList = new ArrayList<>();
    int data = 0;

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList)
            observer.update(data);
    }

    public void whenStateChanges() {
        data = new Random().nextInt();
        notifyObservers();
    }
}
