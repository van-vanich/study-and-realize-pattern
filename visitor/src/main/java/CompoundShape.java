import java.util.ArrayList;
import java.util.List;

public class CompoundShape implements Shape {
    private int id;
    private List<Shape> children = new ArrayList<>();

    public CompoundShape(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public List<Shape> getChildren() {
        return children;
    }

    @Override
    public void move(int x, int y) {
        //logic
    }

    @Override
    public void draw() {
        //logic
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCompoundGraphic(this);
    }

    public void add(Shape shape) {
        children.add(shape);
    }
}
