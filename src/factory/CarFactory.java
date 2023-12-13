package factory;

public class CarFactory {
    public static Car makeCar(String brand) {
        switch (brand) {
            case "BMW":
                return new BMW();
            case "Hyundai":
                return new Hyundai();
            case "Volvo":
                return new Volvo();
            default:
                return null;
        }
    }
}
