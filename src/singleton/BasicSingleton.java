package singleton;

public class BasicSingleton {
    private static BasicSingleton instance = null;

    private BasicSingleton() {

    }

    public static BasicSingleton getInstance() {
        if (instance == null) {
            instance = new BasicSingleton();
        }
        return instance;
    }
    private int a = 100;
    private String sb = "";
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public String getSb() {
        return sb;
    }
    public void setSb(String sb) {
        this.sb = sb;
    }
    public void addToStr (String str) {
        sb += str;
    }

}
