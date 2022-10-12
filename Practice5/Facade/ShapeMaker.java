package Practice5.Facade;

import Practice5.Facade.Shape.Circle;
import Practice5.Facade.Shape.Rectangle;
import Practice5.Facade.Shape.Square;

public class ShapeMaker {
    Circle makeAndPrepareCircle(String texture){
        Circle circle = new Circle();
        circle.initializeVertexBuffer();
        circle.bindShaderAndTexture(texture);
        return circle;
    }

    Rectangle makeAndPrepareRectangle(String texture){
        Rectangle rectangle = new Rectangle();
        rectangle.initializeVertexBuffer();
        rectangle.bindShaderAndTexture(texture);
        return rectangle;
    }

    Square makeAndPrepareSquare(String texture){
        Square square = new Square();
        square.initializeVertexBuffer();
        square.bindShaderAndTexture(texture);
        return square;
    }
}
