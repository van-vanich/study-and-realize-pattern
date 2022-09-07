public class XMLExportVisitor implements Visitor {

    public String export(Shape... args) {
        StringBuilder builder = new StringBuilder();
        builder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n");
        for (Shape shape : args) {
            builder.append(shape.accept(this)).append("\n");
        }
        return builder.toString();
    }

    @Override
    public String visitDot(Dot dot) {
        return "<dot>" + "\n" +
                "    <id>" + dot.getId() + "</id>" + "\n" +
                "    <x>" + dot.getX() + "</x>" + "\n" +
                "    <y>" + dot.getY() + "</y>" + "\n" +
                "</dot>";
    }

    @Override
    public String visitCircle(Circle circle) {
        return "<circle>" + "\n" +
                "    <id>" + circle.getId() + "</id>" + "\n" +
                "    <x>" + circle.getX() + "</x>" + "\n" +
                "    <y>" + circle.getY() + "</y>" + "\n" +
                "    <radius>" + circle.getRadius() + "</radius>" + "\n" +
                "</circle>";
    }

    @Override
    public String visitRectangle(Rectangle rectangle) {
        return "<rectangle>" + "\n" +
                "    <id>" + rectangle.getId() + "</id>" + "\n" +
                "    <x>" + rectangle.getX() + "</x>" + "\n" +
                "    <y>" + rectangle.getY() + "</y>" + "\n" +
                "    <width>" + rectangle.getWidth() + "</width>" + "\n" +
                "    <height>" + rectangle.getHeight() + "</height>" + "\n" +
                "</rectangle>";
    }

    @Override
    public String visitCompoundGraphic(CompoundShape compoundShape) {
        return "<compound_graphic>" + "\n" +
                "   <id>" + compoundShape.getId() + "</id>" + "\n" +
                prepareCompoundGraphicToXML(compoundShape) +
                "</compound_graphic>";
    }

    private String prepareCompoundGraphicToXML(CompoundShape compoundShape) {
        StringBuilder builder = new StringBuilder();
        for (Shape shape : compoundShape.getChildren()) {
            String shapeString = shape.accept(this);
            shapeString = "    " + shapeString.replace("\n", "\n    ") + "\n";
            builder.append(shapeString);
        }
        return builder.toString();
    }
}
