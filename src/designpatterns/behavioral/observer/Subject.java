package designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    List<Observer> observers = new ArrayList<>();

    private int state;

    public void add(Observer observer) {
        observers.add(observer);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        execute();
    }

    public void execute() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
