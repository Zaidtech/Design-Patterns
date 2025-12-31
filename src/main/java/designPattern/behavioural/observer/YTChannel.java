package designPattern.behavioural.observer;

import java.util.*;

public class YTChannel implements Subject {
    private String name;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for(Observer observer : observers) {
            observer.getNotified(message);
        }
    }
}
