package workbook.test6_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Создать коллекцию, наполнить случайными числами, удалить повторяющиеся числа.
 */
public class DeleteRepeatedTest {
    public static void main(String[] args) {
        List<Integer> randomNumbers = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            randomNumbers.add(random.nextInt(10));
        }
        System.out.println(randomNumbers);
        DeleteRepeated deleteRepeated = new DeleteRepeated();
        deleteRepeated.deleteRepeated(randomNumbers);
        System.out.println(randomNumbers);
    }
}
