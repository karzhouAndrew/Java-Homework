package workbook.lab27;

import java.util.Random;

/**
 * Created by Sam on 12.03.2015.
 * Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся числа.
 */
public class TestNumberCollection {
    public static void main(String[] args) {
        NumberCollection numberCollection = new NumberCollection();
        Random random = new Random();
        int numCount = random.nextInt(20) + 20;
        for(int i= 0; i < numCount; i++){
            numberCollection.addNumberToList(random.nextInt(20));
        }

        System.out.printf("Before check = " + numberCollection);
        numberCollection.checkRepetitiveNums();
        System.out.printf("\nAfter check = " + numberCollection);


    }

}
