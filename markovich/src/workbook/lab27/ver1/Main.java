package workbook.lab27.ver1;

import workbook.lab27.ver2.ListOperations;

import java.util.*;

/**
 * Создать коллекцию, наполнить ее случайными числами. Оставить все неповторяющиеся.
 */

public class Main {
    public static void main(String[] args) {
        int quantityNumbers = 12;
        List<Integer> numbers = ListOperations.fillingList(quantityNumbers);
        System.out.println(numbers);
        Set<Integer> numbersSet = new HashSet<Integer>(numbers);
        System.out.println(numbersSet);
    }
}
