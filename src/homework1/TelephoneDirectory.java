package homework1;

import java.util.HashMap;
import java.util.Map;

public class TelephoneDirectory<K, V> extends HashMap<K, V> {
    public TelephoneDirectory(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    public TelephoneDirectory(int initialCapacity) {
        super(initialCapacity);
    }

    public TelephoneDirectory() {
    }
}
