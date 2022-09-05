public class Shipped implements PackageState {
    private static Shipped instance = new Shipped();

    public static Shipped instance() {
        return instance;
    }

    @Override
    public void updateState(DeliveryContext ctx) {
        System.out.println("Package is shipped");
        ctx.setPackageState(InTransition.instance());
    }
}
