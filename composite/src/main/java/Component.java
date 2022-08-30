import java.util.ArrayList;
import java.util.List;

public abstract class Component {

    AccountStatement accountStatement;

    protected List<Component> list = new ArrayList<>();

    public abstract float getBalanced();

    public abstract AccountStatement getStatement();

    public void add(Component g) {
        list.add(g);
    }

    public void remove(Component g) {
        list.remove(g);
    }

    public Component getChild(int i) {
        return list.get(i);
    }
}
