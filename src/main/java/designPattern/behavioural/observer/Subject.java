package designPattern.behavioural.observer;

public interface Subject {
    void register(Observer observer);
    void unregister(Observer observer);

    void notifyObservers(String message);
}
