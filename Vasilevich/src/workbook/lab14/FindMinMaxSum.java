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

        for (int i = 0; i < lenMatrix; i++) {
            if (matrix[i] < matrix[minInd]) {
                minInd = i;
            } else {
                if (matrix[i] > matrix[maxInd]) {
                    maxInd = i;
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

        for (int i = minInd + 1; i < maxInd; i++) {
            sum += matrix[i];
        }
        System.out.println("Sum = " + sum);
    }
}
