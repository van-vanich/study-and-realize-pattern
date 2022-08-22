public class Circle extends Shape {
    public Integer radius;

    public Circle(){
    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Circle) || !super.equals(o)) return false;
        Circle shape = (Circle) o;
        return shape.radius == radius;
    }
}
