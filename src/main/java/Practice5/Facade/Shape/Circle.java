package Practice5.Facade.Shape;

public class Circle implements Shape{

    @Override
    public void initializeVertexBuffer() {
        System.out.println("Initialising Circle vertex buffer");
    }

    @Override
    public void bindShaderAndTexture(String texture) {
        System.out.println("Binding Circle Shader and " + texture + " texture");
    }

    @Override
    public void render() {
        System.out.println("Rendering Circle");
    }
}
