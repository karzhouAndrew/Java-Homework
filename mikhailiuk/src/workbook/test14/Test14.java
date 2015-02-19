package workbook.test14;

import java.util.Random;

/**
 * Created by Natashka on 08.02.2015.
 */
public class Test14 {
    public static void main(String[] args) {
        Random randNumber = new Random();
        int[] array = new int[10];
        int maxElement = 0;
        int maxElementNumber = 0;
        int minElement;
        int minElementNumber = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = randNumber.nextInt();
            System.out.print(array[i] + " ");
            if (maxElement < array[i]) {
                maxElement = array[i];
                maxElementNumber = i;
            }
        }
        minElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minElement > array[i]) {
                minElement = array[i];
                minElementNumber = i;
            }
        }
        System.out.print("\n максимальный элемент № " + maxElementNumber + " значение " + maxElement);
        System.out.print("\n минимальный элемент № " + minElementNumber + " значение " + minElement);
        if (minElementNumber < maxElementNumber) {
            for (int i = minElementNumber + 1; i < maxElementNumber; i++) {
                sum += array[i];
            }
        } else {
            for (int i = maxElementNumber + 1; i < minElementNumber; i++) {
                sum += array[i];
            }
        }
        System.out.print("\nСумма элементов между максимальным и минимальным равна " + sum);
    }
}
