package Practice5.Bridge.Shape;

import Practice5.Bridge.Drawing.DrawingAPI;

public class Circle extends Shape {

    private int x;
    private int y;
    private int radius;

    public Circle(DrawingAPI drawingAPI) {
        super(drawingAPI);
    }

    public Circle(DrawingAPI drawingAPI, int x, int y, int radius) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void setCenter(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        drawingAPI.drawCircle(x, y, radius);
    }
}
