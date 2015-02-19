package workbook.test12;

import java.util.Random;

/**
 * Created by Natashka on 08.02.2015.
 */
public class Test12 {
    public static void main(String[] args) {
        Random randNumber = new Random();
        int[] array = new int[20];
        int maxElement = 0;
        int maxElementNumber = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = randNumber.nextInt(10);
            System.out.print(array[i] + " ");
            if (maxElement < array[i]) {
                maxElement = array[i];
                maxElementNumber = i;
            }
        }
        System.out.print("\nНомер максимального элемента равен ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[maxElementNumber]) {
                System.out.print(" " + i);
            }
        }
    }
}

