package classwork.class5.Task10_2;

import java.util.Iterator;

/**
 * Created by Tonya on 06.03.2015.
 */
public class IteratorArray<String> {

    private Iterator<String> iteratorArray;

    IteratorArray(Iterator<String> iterator) {
        iteratorArray = iterator;
    };

    public void remove() {

    }

    public String next() {
        return null;
    }

    public boolean hasNext() {
        return false;
    }
}
