package workbook.test6_9;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Natashka on 03.03.2015.
 */
public class MaxMarkFinder {
    public int finder(List<Integer> markList) {
        int maxMark = markList.get(0);
        Iterator<Integer> iterator = markList.listIterator();
        while (iterator.hasNext()) {
            int mark = iterator.next();
            if (maxMark < mark) {
                maxMark = mark;
            }
        }
        return maxMark;
    }
}
