public class VisitorApplication {
    public static void main(String[] args) {
        Shape dot = new Dot(1, 10, 10);
        Shape circle = new Circle(2, 5, 5, 5);
        Shape rectangle = new Rectangle(3, 0, 0, 10, 10);

        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        CompoundShape compoundShape1 = new CompoundShape(5);
        compoundShape1.add(dot);
        compoundShape.add(compoundShape1);

        export(circle, compoundShape);

    }

    private static void export(Shape... shapes) {
        XMLExportVisitor visitor = new XMLExportVisitor();
        System.out.println(visitor.export(shapes));
    }
}
