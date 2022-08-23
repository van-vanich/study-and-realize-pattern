public abstract class Car {
    private CarType model;
    protected Car(CarType model) {
        this.model = model;
    }

    protected abstract void construct();

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }
}
