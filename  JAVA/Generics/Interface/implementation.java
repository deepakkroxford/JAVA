package Generics.Interface;

interface Container<T> {
    void add(T item);
    T get();
}

class genericContainer<T> implements Container<T> {
    private T item;

    @Override
    public void add(T item) {
        this.item = item;
    }

    @Override
    public T get() {
        return item;
    }
}

public class implementation {
    public static void main(String[] args) {
        genericContainer<String> g1 = new genericContainer<>();
        g1.add("Deepak Kumar Singh");
        System.out.println(g1.get());

    }
}
