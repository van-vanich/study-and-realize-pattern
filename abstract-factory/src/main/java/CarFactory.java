public class CarFactory {
    private CarFactory(){
    }

    public static Car buildCar(CarType model) {
        Car car;
        Location location = Location.USA; //Read location property somewhere from configuration

        switch (location) {
            case USA:
                car = USACarFactory.buildFactory(model);
                break;
            case ASIA:
                car = AsiaCarFactory.buildFactory(model);
                break;
            case DEFAULT:
                car = DefaultCarFactory.buildFactory(model);
                break;
            default:
                throw new EnumConstantNotPresentException(CarType.class, model.name());
        }
        return car;
    }
}
