public class CarFactory {
    public static Car buildCar(CarType model) {
        Car car;
        switch (model) {
            case LUXURY:
                car = new LuxuryCar();
                break;
            case SMALL:
                car = new SmallCar();
                break;
            case SEDAN:
                car = new SedanCar();
                break;
            default:
                throw new EnumConstantNotPresentException(CarType.class, model.name());
        }
        return car;
    }
}
