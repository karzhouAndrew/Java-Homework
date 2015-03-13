package workbook.lab32;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Asus on 04.03.2015.
 */
public class Task7 {
    public static void main(String[] args) {
        List<Integer> mark = new ArrayList<Integer>();
        mark.add(5);
        mark.add(3);
        mark.add(4);
        mark.add(5);
        mark.add(2);
        mark.add(3);
        mark.add(1);
        mark.add(5);
        mark.add(5);
        mark.add(0);
        mark.add(5);
        mark.add(5);
        System.out.println("Список с оценками учеников " + mark);
        ListIterator<Integer> goodMark = mark.listIterator();
        while (goodMark.hasNext()) {
            if (goodMark.next() < 4) {
                goodMark.remove();
            }
        }
        System.out.println("Положительные оценки " + mark);
    }
}
