package Practice3.Prototype;

import Practice3.Prototype.shapes.Circle;
import Practice3.Prototype.shapes.Rectangle;
import Practice3.Prototype.shapes.Shape;
import Practice3.Prototype.shapes.Square;

import java.util.HashMap;

public class ShapeCache {
    private HashMap<String, Shape> shapeMap;

    public ShapeCache() {
        this.shapeMap = new HashMap<>();
    }

    public Shape getShape(String id) {
        return (Shape) shapeMap.get(id).clone();
    }

    public void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);

        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(), square);
    }
}
