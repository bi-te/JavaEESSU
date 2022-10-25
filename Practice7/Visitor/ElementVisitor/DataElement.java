package Practice7.Visitor.ElementVisitor;

public interface DataElement {
    void accept(DataElementVisitor visitor);
}
