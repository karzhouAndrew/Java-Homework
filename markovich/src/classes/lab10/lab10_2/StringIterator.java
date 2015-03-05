package classes.lab10.lab10_2;

import java.util.Iterator;

public class StringIterator<Type> implements Iterator<Type> {
    private Type[] array;
    private int currentSize;
    private int currentIndex = 0;

    public StringIterator(Type[] array) {
        this.array = array;
        this.currentSize = currentSize;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < currentSize && array[currentIndex] != null;
    }

    @Override
    public Type next() {
        return array[currentIndex++];
    }

    @Override
    public void remove() {

    }
}
