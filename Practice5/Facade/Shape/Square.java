package Practice5.Facade.Shape;

public class Square implements Shape{

    @Override
    public void initializeVertexBuffer() {
        System.out.println("Initialising Square vertex buffer");
    }

    @Override
    public void bindShaderAndTexture(String texture) {
        System.out.println("Binding Square Shader and " + texture + " texture");
    }

    @Override
    public void render() {
        System.out.println("Rendering Square");
    }
}
