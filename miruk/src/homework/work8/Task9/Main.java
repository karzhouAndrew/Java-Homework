package homework.work8.Task9;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Создать список оценок учеников с помощью ArryList, заполнить случайными оценками. Найти самую высокую оценку с использованием итератора.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        int integer = 20;
        for (int i = 0; i < integer; i++) {
            int value = (int) (Math.random() * 100);
            arrayList.add(value);
        }
        int size = arrayList.size();
        int temp = 0;
        int max = 0;
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            temp = iterator.next();
            if (max<temp) max = temp;
            System.out.print(temp+", ");
        }
        System.out.println();
        System.out.println(max);
    }
}
