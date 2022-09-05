public class StateApplication {
    public static void main(String[] args) {
        DeliveryContext ctx = new DeliveryContext(null, "Hello");

        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
    }
}
