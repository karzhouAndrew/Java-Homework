package workbook.lab27;

import workbook.lab26.GeneratorGrade;

import java.util.*;

/**
 * Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся числа.
 */
public class DuplicateNumbers {
    public static void main(String[] args) {
        int numberOfElements = 20;
        List<Integer> list = new ArrayList<Integer>(numberOfElements);
        for (int i = 0; i < numberOfElements; i++) {
            list.add(new GeneratorGrade().getGrade());
        }
        System.out.println(list);
        Set<Integer> set = new LinkedHashSet<Integer>();
        set.addAll(list);
        System.out.println(set);
    }
}
