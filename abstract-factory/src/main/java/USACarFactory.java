public class USACarFactory {

    private USACarFactory(){
    }

    public static Car buildFactory(CarType model) {
        Car car;
        switch (model) {
            case LUXURY:
                car = new LuxuryCar(Location.USA);
                break;
            case SMALL:
                car = new SmallCar(Location.USA);
                break;
            case SEDAN:
                car = new SedanCar(Location.USA);
                break;
            default:
                throw new EnumConstantNotPresentException(CarType.class, model.name());
        }
        return car;
    }
}
