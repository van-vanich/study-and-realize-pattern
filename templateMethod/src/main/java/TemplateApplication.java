public class TemplateApplication {
    public static void main(String[] args) {
        System.out.println("Going to build concrete wall house");
        House house = new ConcreteWallHouse();
        house.buildHouse();

        System.out.println("Concrete wall house constructed successfully!");
        System.out.println("___________________________________________________");

        System.out.println("Going to build glass wall house");
        house = new GlassWallHouse();
        house.buildHouse();
        System.out.println("Glass wall house constructed successfully!");
    }
}
