package designPattern.behavioural.observer;

public class Main {
    public static void main(String[] args) {
        YTChannel ytChannel = new YTChannel();
        Subscriber subscriber = new Subscriber();

        ytChannel.register(subscriber);
        ytChannel.notifyObservers("Welcome to YT Channel:  ");
    }
}
