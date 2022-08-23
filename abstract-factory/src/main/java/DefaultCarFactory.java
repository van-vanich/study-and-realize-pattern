public class DefaultCarFactory {

    private DefaultCarFactory(){
    }

    public static Car buildFactory(CarType model) {
        Car car;
        switch (model) {
            case LUXURY:
                car = new LuxuryCar(Location.DEFAULT);
                break;
            case SMALL:
                car = new SmallCar(Location.DEFAULT);
                break;
            case SEDAN:
                car = new SedanCar(Location.DEFAULT);
                break;
            default:
                throw new EnumConstantNotPresentException(CarType.class, model.name());
        }
        return car;
    }
}
