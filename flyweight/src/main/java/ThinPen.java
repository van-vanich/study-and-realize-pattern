public class ThinPen implements Pen{
    private BrushSize brushSize = BrushSize.THIN;
    private String color = null;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw(String content) {
        System.out.println("Drawing " + brushSize + " content(" + content + ") in color: " + color);
    }
}
