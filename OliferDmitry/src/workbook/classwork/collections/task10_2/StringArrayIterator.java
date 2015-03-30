package workbook.classwork.collections.task10_2;

import java.util.Iterator;

public class StringArrayIterator implements Iterator {

    private String[] strArray;

    public String[] getStrArray() {
        return strArray;
    }

    private int index;

    public StringArrayIterator(String[] strArray) {
        this.strArray = strArray;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index >= 0 && index < strArray.length) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String next() {
        if (index >= 0 && index < strArray.length) {
            return strArray[++index - 1];
        } else {
            return null;
        }
    }

    @Override
    public void remove() {
        for (int i = index - 1; i < strArray.length - 1; i++) {
            strArray[i] = strArray[i + 1];
        }
        String[] newArr = new String[strArray.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = strArray[i];
        }
        strArray = newArr;
    }
}
