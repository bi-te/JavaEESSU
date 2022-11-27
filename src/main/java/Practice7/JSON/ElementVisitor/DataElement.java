package Practice7.JSON.ElementVisitor;

import java.util.TreeMap;

public interface DataElement {
    void accept(DataElementVisitor visitor, TreeMap<String, String> map);
}
