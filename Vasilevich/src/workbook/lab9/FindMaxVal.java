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
        for (int ind = 0; ind < randomValCount; ind++) {
            arr[ind] = rand.nextInt(100);
            if (maxVal < arr[ind]) {
                maxVal = arr[ind];
            }
            System.out.print(arr[ind]);
            if (ind < (randomValCount - 1)) {
                System.out.print(", ");
            } else {
                System.out.print("]");
            }
        }
        System.out.println("");
        System.out.println("MaxValue = " + maxVal);

    }
}
