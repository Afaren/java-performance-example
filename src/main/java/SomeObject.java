import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.nonNull;

public class SomeObject {
    private static Map<Integer, SomeObject> cache = new HashMap<>();
    private int property;


    public SomeObject(int property) {
        this.property = property;
    }

    static SomeObject getInstance(int property) {
        if (nonNull(cache.get(property))) {
            return cache.get(property);
        } else {
            SomeObject someObject = new SomeObject(property);
            cache.put(property, someObject);
            return someObject;

        }
    }
}
