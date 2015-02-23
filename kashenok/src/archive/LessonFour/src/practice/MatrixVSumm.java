package practice;

import java.util.Random;

public class MatrixVSumm {
    public static void main(String[] args) {
        Random rand = new Random();
        int p = rand.nextInt(10) + 1;
        int[][] mass = new int[p][p];

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                mass[i][j] = rand.nextInt(15) + 1;
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }




    }
}
