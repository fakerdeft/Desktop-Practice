package collection;

public class Generics1<T> {
    private T value;

    public T readValue() {
        return value;
    }

    public void updateValue(T value) {
        this.value = value;
    }
}
