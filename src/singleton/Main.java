package singleton;

public class Main {
    public static void main(String[] args) {
        FancySingleton f1 = FancySingleton.INSTANCE;
        FancySingleton f2 = FancySingleton.INSTANCE;
        f1.setA(222);
        System.out.println(f2.getA());


        BasicSingleton b = BasicSingleton.getInstance();
        BasicSingleton b2 = BasicSingleton.getInstance();
        System.out.println(b.getSb());
        b2.addToStr("Alex");
        System.out.println(b.getSb());
    }
}
