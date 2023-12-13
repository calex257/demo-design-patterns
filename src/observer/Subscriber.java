package observer;

public class Subscriber implements Observer {
    String reaction;

    @Override
    public void update(String str) {
        System.out.println(str + " made me go like this: " + reaction);
    }

    public Subscriber(String reaction) {
        this.reaction = reaction;
    }
}
