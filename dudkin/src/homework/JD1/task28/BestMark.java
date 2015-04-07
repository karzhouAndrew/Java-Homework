package homework.JD1.task28;

import java.util.*;

public class BestMark {

    public static void main(String[] args) {
        Object mark = null;
        List<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            arrayList.add((int) (Math.random() * 10 + 1));
        }
        System.out.println("Список оценок: " + arrayList);
        Set<Integer> bestMark = new TreeSet<Integer>(arrayList);
        Iterator iterator = bestMark.iterator();
        while (iterator.hasNext()) {
            mark = iterator.next();
        }
        System.out.println("Самая высокая оценка: " + mark);
    }

}