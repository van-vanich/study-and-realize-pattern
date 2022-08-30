public class DecoratorApplication {
    public static void main(String[] args) {
        SupportPopupDecorator supportPopupDecorator = new SupportPopupDecorator(new SupportLinkDecorator(new SupportReport()));
        System.out.println(supportPopupDecorator.getFirstColumnData());
    }
}
