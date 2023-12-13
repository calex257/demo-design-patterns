package factory;

public class Main {
    public static void main(String[] args) {
        Car c1 = CarFactory.makeCar("Volvo");
        Car c2 = CarFactory.makeCar("Hyundai");
        Car c3 = CarFactory.makeCar("BMW");
        Volvo v1;
        if (c1 instanceof Volvo) {
            v1 = (Volvo) c1;
        }
        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c3.getName());
    }
}
