// Sozdat' collection, randomno zapolnit' celymi chislami. Povtory udalit'.
package workbook.listTask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        int size = 15;
        for (int i = 0; i < size; i++) {
            list.add((int)(Math.random() * 10) + 1);
        }
        System.out.println(list);

        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            Integer current =  iter.next();
            int count = 0;
            for (Integer i : list) {
                if (i == (int)current) {
                    count++;
                }
                if (count > 1) {
                    iter.remove();
                    break;
                }
            }
        }
        System.out.println(list);
    }
}
