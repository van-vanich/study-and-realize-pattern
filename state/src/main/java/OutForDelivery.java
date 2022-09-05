public class OutForDelivery implements PackageState {
    private static OutForDelivery instance = new OutForDelivery();

    public static OutForDelivery instance() {
        return instance;
    }

    @Override
    public void updateState(DeliveryContext ctx) {
        System.out.println("Package is out of delivery");
        ctx.setPackageState(Delivered.instance());
    }
}
