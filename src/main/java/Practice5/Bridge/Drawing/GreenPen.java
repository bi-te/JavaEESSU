package Practice5.Bridge.Drawing;

public class GreenPen implements DrawingAPI{
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Drawing Circle with radius " + radius + " at (" + x + ", " + y + ") with green pen");
    }
}
