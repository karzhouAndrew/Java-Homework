package workbook.lab13;

import java.util.Random;

/**
 * Created by Sam on 20.02.2015.
 * Создать массив, заполнить его случайными элементами, распечатать, перевернуть, и снова распечатать.
 * Задача была изменена как для двухмерного массива
 */
public class RotateMatrix {
    public static void main(String[] args) {
        Random rand = new Random();

        int lenMatrix = 3;
        int matrixNew[][] = new int[lenMatrix][lenMatrix];
        System.out.println("Matrix");
        for (int indY = 0; indY < lenMatrix; indY++) {
            for (int indX = 0; indX < lenMatrix; indX++) {
                matrixNew[indY][indX] = rand.nextInt(50);
                System.out.print(matrixNew[indY][indX] + "	");
            }
            System.out.println("");

        }

        System.out.println("Rotating Matrix");
        for (int indY = 0; indY < lenMatrix; indY++) {
            for (int indX = 0; indX < lenMatrix; indX++) {

                System.out.print(matrixNew[lenMatrix - 1 - indX][indY] + "	");
            }
            System.out.println("");

        }
    }
}
