public class InTransition implements PackageState {

    private static InTransition instance = new InTransition();

    public static InTransition instance() {
        return instance;
    }

    @Override
    public void updateState(DeliveryContext ctx) {
        System.out.println("Package is in transition");
        ctx.setPackageState(OutForDelivery.instance());
    }
}
