package workbook.lab27;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся числа.
 */
public class Load {
    public static void main(String[] args) {

        List<Integer> arrayNumbers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            arrayNumbers.add((int) (Math.random() * 10 + 1));
        }
        System.out.println(arrayNumbers);
        Integer currentNumber;
        for (int i = 0; i < arrayNumbers.size(); i++) {
            currentNumber = arrayNumbers.get(i);
            for (int j = i + 1; j < arrayNumbers.size(); j++) {
                if (currentNumber == arrayNumbers.get(j)) {
                    arrayNumbers.remove(j);
                    j--;
                }
            }
        }

        System.out.println(arrayNumbers);
    }


}
