import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.nonNull;

public class SomeObjectFactory {
    private static Map<Integer, SomeObject> cache = new HashMap<>();

    private SomeObjectFactory() {}

    public static SomeObject getInstance(int property) {
        if (nonNull(cache.get(property))) {
            return cache.get(property);
        } else {
            SomeObject someObject = new SomeObject(property);
            cache.put(property, someObject);
            return someObject;

        }
    }
}
