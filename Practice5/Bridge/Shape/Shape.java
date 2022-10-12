package Practice5.Bridge.Shape;

import Practice5.Bridge.Drawing.DrawingAPI;

public abstract class Shape implements Cloneable{
    protected DrawingAPI drawingAPI;

    public Shape(DrawingAPI drawingAPI){
        this.drawingAPI = drawingAPI;
    }

    public abstract void draw();

    public DrawingAPI getDrawingAPI() {
        return drawingAPI;
    }

    public void setDrawingAPI(DrawingAPI drawingAPI) {
        this.drawingAPI = drawingAPI;
    }

    @Override
    public Object clone() {
        Object clone = null;

        try{
            clone = super.clone();
        } catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

        return clone;
    }
}
