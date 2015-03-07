package classes.lab10.lab10_2;

import java.util.Iterator;

public class StringIterator implements Iterator{
    private String[] stringArray;
    private int stringIndex;

    public StringIterator(String[] strArray) {
        this.stringArray = strArray;
        this.stringIndex = 0;
    }

    @Override
    public boolean hasNext() {
        if (stringIndex < stringArray.length) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String next() {
        if (stringIndex < stringArray.length) {
            return stringArray[stringIndex++];
        } else {
            return null;
        }
    }

    @Override
    public void remove() {

    }
}
