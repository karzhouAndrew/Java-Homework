package workbook.lab14;

import java.util.Random;

/**
 * Created by Sam on 20.02.2015.
 * Определите сумму элементов одномерного массива, расположенного между минимальным и максимальным значениями
 */
public class FindMinMaxSum {
    public static void main(String[] args) {
        Random rand = new Random();
        int lenMatrix = rand.nextInt(10) + 20;
        int matrix[] = new int[lenMatrix];
        System.out.println("Array");
        for (int indX = 0; indX < lenMatrix; indX++) {
            matrix[indX] = rand.nextInt(50);
            System.out.print(matrix[indX] + " ");
        }

        int minInd = 0;
        int maxInd = 0;
        int sum = 0;

        for (int ind = 0; ind < lenMatrix; ind++) {
            if (matrix[ind] < matrix[minInd]) {
                minInd = ind;
            } else {
                if (matrix[ind] > matrix[maxInd]) {
                    maxInd = ind;
                }
            }
        }

        if (minInd > maxInd) {
            int temp = minInd;
            minInd = maxInd;
            maxInd = temp;
        }
        System.out.println("");
        System.out.println("Range = (" + minInd + ", " + maxInd + ")");

        for (int ind = minInd + 1; ind < maxInd; ind++) {
            sum += matrix[ind];
        }
        System.out.println("Sum = " + sum);
    }
}
