package Practice3.Prototype;

import Practice3.Prototype.shapes.Shape;
import Practice3.Prototype.shapes.Square;

public class PrototypePatternDemo {
    public static void main(String[] args){
        ShapeCache shapeCache = new ShapeCache();

        shapeCache.loadCache();

        Shape circle = shapeCache.getShape("1");
        System.out.println("Id: " + circle.getId() + ", Shape: " + circle.getType());

        Shape unknown = shapeCache.getShape("2");
        System.out.println("Id: " + unknown.getId() + ", Shape: " + unknown.getType());

        Square square = (Square) shapeCache.getShape("3");
        System.out.println("Id: " + square.getId() + ", Shape: " + square.getType());
    }
}
