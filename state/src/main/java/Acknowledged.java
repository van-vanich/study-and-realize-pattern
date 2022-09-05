public class Acknowledged implements PackageState {
    private static Acknowledged instance = new Acknowledged();


    public static Acknowledged instance() {
        return instance;
    }

    @Override
    public void updateState(DeliveryContext ctx) {
        System.out.println("Package is acknowledge");
        ctx.setPackageState(Shipped.instance());
    }
}
