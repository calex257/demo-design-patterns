package visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(500);
        Square s = new Square();
        Shape sh = new Square();
        ShapeVisitor visitor = new ShapeVisitor();
        visitor.visit(c);
        visitor.visit(s);
        visitor.visit((Square) sh);
    }
}
