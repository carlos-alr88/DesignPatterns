package design_patterns.src.com.carlos.designpatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    List<Observer> observers = new ArrayList<>();
    
    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    public void removeObserver(Observer obs) {
        observers.remove(obs);
    }

    public void update() {
        for (Observer obs : this.observers) {
            obs.update();
        }
    }
}
