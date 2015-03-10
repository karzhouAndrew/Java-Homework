package classwork.collections10_2;

import java.util.Iterator;

/**
 * Created by Leonid on 09.03.2015.
 */
public class IteratorArray<T> implements Iterator<T> {
    private T[] currentArray;
    private int size;
    private int index = 0;

    public IteratorArray(T[] array) {
        currentArray = array;
        size = currentArray.length;
    }

    @Override
    public boolean hasNext() {
        return index < size && currentArray[index++] != null;
    }

    @Override
    public T next() {
        return currentArray[index - 1];
    }

    @Override
    public void remove() {

    }
}
