package visitor;

public class ShapeVisitor implements MyVisitor{
    @Override
    public void visit(Circle circle) {
        System.out.println("din cerc");
        System.out.println(circle.ID);
        System.out.println(circle.raza);
    }

    @Override
    public void visit(Square square) {
        System.out.println("din patrat");
        System.out.println(square.ID);
        System.out.println(square.latura);
        System.out.println(square.getPerimetru());
    }
}
