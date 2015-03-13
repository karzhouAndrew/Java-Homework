package workbook.lab34;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by Asus on 04.03.2015.
 */
public class Task9 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<Integer>();
        Random generator = new Random();
        marks.add((Integer) generator.nextInt(10));
        marks.add((Integer) generator.nextInt(10));
        marks.add((Integer) generator.nextInt(10));
        marks.add((Integer) generator.nextInt(10));
        marks.add((Integer) generator.nextInt(10));
        marks.add((Integer) generator.nextInt(10));
        marks.add((Integer) generator.nextInt(10));
        marks.add((Integer) generator.nextInt(10));
        marks.add((Integer) generator.nextInt(10));
        marks.add((Integer) generator.nextInt(10));
        marks.add((Integer) generator.nextInt(10));
        marks.add((Integer) generator.nextInt(10));
        marks.add((Integer) generator.nextInt(10));
        marks.add((Integer) generator.nextInt(10));
        marks.add((Integer) generator.nextInt(10));
        System.out.println("Список оценок учеников, заполненный случайными оценками " + marks);
        Iterator<Integer> searchMark = marks.iterator();
        int highterMark = 0;
        while (searchMark.hasNext()) {
            int compareMark = searchMark.next();
            if (highterMark < compareMark) {
                highterMark = compareMark;
            }
        }
        System.out.println("Самая высокая оценка " + highterMark);

    }
}

