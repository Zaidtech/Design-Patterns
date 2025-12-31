package designPattern.behavioural.observer;

public class Subscriber implements Observer {
    @Override
    public void getNotified(String message) {
        System.out.println("Notified about a change in the subject"+message);
    }
}
