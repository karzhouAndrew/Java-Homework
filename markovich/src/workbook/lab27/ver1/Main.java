package workbook.lab27.ver1;

import java.util.*;

/**
 * Создать коллекцию, наполнить ее случайными числами. Оставить все неповторяющиеся.
 */

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        Random random = new Random();

        int quantityNumbers = 12;

        for (int i = 0; i < quantityNumbers; i++) {
            numbers.add(i, random.nextInt(10));
        }
        System.out.println(numbers);

        Set<Integer> numbersSet = new HashSet<Integer>(numbers);
        System.out.println(numbersSet);
    }
}
