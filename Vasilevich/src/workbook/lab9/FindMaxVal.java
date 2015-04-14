package workbook.lab9;

import java.util.Random;

/**
 * Created by Sam on 20.02.2015.
 * Как в примере имеется последовательность  случайных чисел. Найти и вывести наибольшее из них
 */
public class FindMaxVal {
    public static void main(String[] args) {
        int randomValCount = 10;
        Random rand = new Random();
        int arr[] = new int[randomValCount];
        int maxVal = Integer.MAX_VALUE;

        System.out.print("Array = [");
        for (int i = 0; i < randomValCount; i++) {
            arr[i] = rand.nextInt(100);
            if (maxVal < arr[i]) {
                maxVal = arr[i];
            }
            System.out.print(arr[i]);
            if (i < randomValCount - 1) {
                System.out.print(", ");
            } else {
                System.out.print("]");
            }
        }
        System.out.println("");
        System.out.println("MaxValue = " + maxVal);

    }
}
