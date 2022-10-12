package Practice5.Bridge;

import Practice5.Bridge.Drawing.GreenPen;
import Practice5.Bridge.Drawing.RedPen;
import Practice5.Bridge.Shape.Circle;

public class BridgePatterDemo {
    public static void main(String[] args) {
        Circle redCircle = new Circle(new RedPen(), 5, 5, 10);
        Circle greenCircle = new Circle(new GreenPen(), -5, -5, 10);

        redCircle.draw();
        greenCircle.draw();
    }
}
