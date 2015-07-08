package added.lab12;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.lang.String;


/**
 * Created by Sam on 04.03.2015.
 */
public class StringList {
    String[] list;
    int iteratorIndex;

    public StringList(String list) {
        this.list = list.split(" +");
    }

    public StringIterator<String> iterator() {
        return new StringIterator<String>();
    }

    private String[] removeItem(int index) {

        if ((index >= 0) && (index < list.length)) {
            String[] newList = new String[list.length - 1];

            for (int i = 0; i < index; i++) {
                newList[i] = list[i];
            }

            for (int i = index; i < newList.length; i++) {
                newList[i] = list[i + 1];
            }
            return newList;
        }
        return list;
    }

    class StringIterator<String> implements Iterator<String> {
        private int index;
        private String next;

        StringIterator() {
            index = 0;
        }

        public boolean hasNext() {
            return next != null;
        }

        public String next() {
            if (next == null) {
                if (index < list.length) {
                    next = (String) list[index];
                }
            }

            String nextString = next;
            if (++index < list.length) {
                next = (String) list[index];
            } else {
                next = null;
            }
            return nextString;
        }

        public void remove() {
            list = removeItem(index - 1);
            index--;
        }
    }
}