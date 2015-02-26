package generics;

/**
 * Created by user on 25.02.2015.
 */
public class Box<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
