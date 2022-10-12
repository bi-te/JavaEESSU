package Practice5.Facade.Shape;

public class Rectangle implements Shape{

    @Override
    public void initializeVertexBuffer() {
        System.out.println("Initialising Rectangle vertex buffer");
    }

    @Override
    public void bindShaderAndTexture(String texture) {
        System.out.println("Binding Rectangle Shader and " + texture + " texture");
    }

    @Override
    public void render() {
        System.out.println("Rendering Rectangle");
    }
}
