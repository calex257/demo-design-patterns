package observer;

import java.util.ArrayList;
import java.util.List;

public class Youtuber implements Subject{
    List<Observer> subs;
    String s;



    public Youtuber(String s) {
        this.s = s;
        this.subs = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        subs.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subs.remove(observer);
    }

    @Override
    public void notifyObservers(String str) {
        for (Observer o : subs) {
            o.update(str);
        }
    }
}
