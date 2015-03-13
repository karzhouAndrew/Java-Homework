package classes.lab10.lab10_2;

import java.util.Iterator;

public class StringIterator implements Iterator {
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
        for (int i = stringIndex; i < stringArray.length; i++) {
            stringArray[i - 1] = stringArray[i];
        }
        String[] newStringArray = new String[stringArray.length - 1];
        for (int i = 0; i < newStringArray.length; i++) {
            newStringArray[i] = stringArray[i];
        }
        stringArray = newStringArray;
    }

    public String[] getStringArray() {
        return stringArray;
    }
}
