public class AsiaCarFactory {

    private AsiaCarFactory() {
    }

    public static Car buildFactory(CarType model) {
        Car car;
        switch (model) {
            case LUXURY:
                car = new LuxuryCar(Location.ASIA);
                break;
            case SMALL:
                car = new SmallCar(Location.ASIA);
                break;
            case SEDAN:
                car = new SedanCar(Location.ASIA);
                break;
            default:
                throw new EnumConstantNotPresentException(CarType.class, model.name());
        }
        return car;
    }
}
