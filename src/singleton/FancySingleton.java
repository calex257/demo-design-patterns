package singleton;

public enum FancySingleton {
    INSTANCE;

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
