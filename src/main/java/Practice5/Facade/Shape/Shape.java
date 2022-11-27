package Practice5.Facade.Shape;

public interface Shape {

    void initializeVertexBuffer();
    void bindShaderAndTexture(String texture);
    void render();
}
