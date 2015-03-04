package workbook.test6_8;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Natashka on 03.03.2015.
 */
public class DeleteRepeated {
    public List<Integer> deleteRepeated(List<Integer> numList){
        Iterator <Integer> iterator;
        for (int i = 0; i < numList.size(); i++) {
            Integer temp = numList.get(i);
            iterator = numList.listIterator(i+1);
            while (iterator.hasNext()) {
                if (temp.equals(iterator.next())) {
                    iterator.remove();
                }
            }
        }
        return numList;
    }
}
