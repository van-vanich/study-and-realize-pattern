import java.util.ArrayList;
import java.util.List;

public class PrototypeApplication {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 1;
        circle.y = 2;
        circle.radius = 3;
        circle.color = "blue";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.x = 5;
        rectangle.y = 5;
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "green";
        shapes.add(rectangle);

        cloneAndCompare(shapes);
    }

    private static void cloneAndCompare(List<Shape> shapes) {
        List<Shape> shapesCopy = new ArrayList<>();
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects!");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are equals!");
                } else {
                    System.out.println(i + ": But they are not equals!");
                }
            } else {
                System.out.println(i + ": Shape objects are the same!");
            }
        }
    }
}
