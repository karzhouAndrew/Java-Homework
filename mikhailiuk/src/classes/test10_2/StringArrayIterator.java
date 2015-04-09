package classes.test10_2;

/**
 * Created by Natashka on 04.03.2015.
 */
public class StringArrayIterator implements java.util.Iterator {
    private int cursor;
    private String[] strArr;

    public void setCursor(int cursor) {
        this.cursor = cursor;
    }

    public StringArrayIterator(String[] strArr) {
        this.strArr = strArr;
    }

    @Override
    public boolean hasNext() {
        if (cursor < strArr.length) {
            if (strArr[cursor] != null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String next() {
        return strArr[cursor++];
    }

    @Override
    public void remove() {
        String[] strArr1 = new String[strArr.length - 1];
        int i = 0;
        for (String string : strArr) {
            if (string.equals(strArr[cursor-1])) {
                continue;
            }
            strArr1[i] = string;
            i++;
        }
        strArr = strArr1;
    }
}
