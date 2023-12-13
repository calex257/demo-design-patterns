package observer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Subscriber s1 = new Subscriber("yay");
        Subscriber s2 = new Subscriber("boo");
        Subscriber s3 = new Subscriber("meh");
        Youtuber yt = new Youtuber("Internet Historian");
        yt.addObserver(s1);
        yt.addObserver(s2);
        yt.addObserver(s3);
        yt.notifyObservers("The fall of 76");
    }
}
