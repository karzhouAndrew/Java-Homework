package workbook.lab27.ver2;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Создать коллекцию, наполнить ее случайными числами. Удалить все повторяющиеся числа.
 */

public class Main {

    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<Integer>();
        List<Integer> finalList = new ArrayList<Integer>();

        Random random = new Random();

        int quantityNumbers = 10;

        for (int i = 0; i < quantityNumbers; i++) {
            numbersList.add(i, random.nextInt(7));
        }

        System.out.println(numbersList);

        for (int i = 0; i < numbersList.size(); i++) {
            boolean existNumber = false;
            for (int j = 0; j < numbersList.size(); j++) {
                if (i != j && numbersList.get(i).equals(numbersList.get(j))) {
                    existNumber = true;
                    break;
                }
            }
            if (!existNumber) {
                finalList.add(numbersList.get(i));
            }
        }

        System.out.println(finalList);
    }
}
