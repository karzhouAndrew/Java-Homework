package workbook.test9;

import java.util.Random;

/**
 * Created by Natashka on 08.02.2015.
 */
public class Test9 {
    public static void main(String[] args) {
        Random randNumber = new Random();
        int[] array = new int[10];
        int maxElement = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = randNumber.nextInt();
            System.out.print(array[i] + " ");
            if (maxElement < array[i]) {
                maxElement = array[i];
            }
        }
        System.out.println("\nМаксимальный элемент равен " + maxElement);
    }
}
