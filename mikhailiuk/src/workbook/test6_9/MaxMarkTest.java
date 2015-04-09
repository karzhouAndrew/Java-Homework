package workbook.test6_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Создать список оценок учеников, заполнить случайными, найти самую высокую.
 */
public class MaxMarkTest {
    public static void main(String[] args) {
        List<Integer> markList = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            markList.add(random.nextInt(11));
        }
        System.out.println(markList);
        MaxMarkFinder maxMarkFinder = new MaxMarkFinder();
        System.out.println(maxMarkFinder.finder(markList));
    }
}