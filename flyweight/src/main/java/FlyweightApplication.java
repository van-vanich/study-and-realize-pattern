public class FlyweightApplication {
    public static void main(String[] args) {
        Pen redPen1 = PenFactory.getThinPen("red");
        redPen1.draw("Hello!");
        Pen redPen2 = PenFactory.getMediumPen("red");
        redPen2.draw("Hello!");
        Pen redPen3= PenFactory.getThinPen("red");
        redPen3.draw("Hello!");
        Pen bluePen = PenFactory.getThickPen("blue");
        bluePen.draw("Hello!");

        System.out.println(redPen1.hashCode());
        System.out.println(redPen2.hashCode());
        System.out.println(redPen3.hashCode());
        System.out.println(bluePen.hashCode());
    }
}
