package homework1;
import java.util.HashMap;

public class MyMap<K,V> extends HashMap<K, V> {

    @Override
    public V put(K key, V value) {
        if(super.containsKey(key) && super.get(key).equals(value)){
            throw new IllegalStateException("Одинаковые ключ и значения");
        } else if (super.containsKey(key) && !super.get(key).equals(value)) {
            return super.replace(key, value);
        } else {
            return super.put(key, value);
        }
    }
}
