package Practice5.Facade;

import Practice5.Facade.Shape.Circle;
import Practice5.Facade.Shape.Rectangle;
import Practice5.Facade.Shape.Square;

public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        Circle circle = shapeMaker.makeAndPrepareCircle("circleTexture.dds");
        circle.render();
        System.out.println();

        Rectangle rectangle = shapeMaker.makeAndPrepareRectangle("rectangleTexture.dds");
        rectangle.render();
        System.out.println();

        Square square = shapeMaker.makeAndPrepareSquare("squareTexture.dds");
        square.render();
        System.out.println();
    }
}
