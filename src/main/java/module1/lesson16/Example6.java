package module1.lesson16;

public class Example6 {
    public static void main(String[] args) {
        Pair<String, Integer> stringIntegerPair = new Pair<>("", 1);
        Pair<Pair<String, Integer>, String> b = new Pair<>(stringIntegerPair, "blabla");

    }
}
// T --> TYPE, E --> ENTITY, K --> KEY, V --> VALUE, I --> INPUT, O --> OUTPUT
class Pair<K, V> {
    K key;
    V value;

    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }
}
