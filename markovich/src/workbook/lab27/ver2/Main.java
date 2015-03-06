package workbook.lab27.ver2;

import java.util.List;

/**
 * Создать коллекцию, наполнить ее случайными числами. Удалить все повторяющиеся числа.
 */

public class Main {

    public static void main(String[] args) {
        int quantityNumbers = 10;
        List<Integer> numberslist = ListOperations.fillingList(quantityNumbers);
        System.out.println(numberslist);
        System.out.println(ListOperations.deleteDuplicate(numberslist));
    }

}
