package homework;

import java.util.Random;

public class ArrayRotate {
    public static void main(String[] args) {
        Random rand = new Random();
        int p = rand.nextInt(8) + 3;
        int[][] array = new int[p][p];
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < p; j++) {
                array[i][j] = rand.nextInt(20) + 1;
                //System.out.print(i + "," + j + " ");
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();


        int [][] mass = new int[p][p];

        for (int m = 0; m < p; m++) {
            for (int k = 0; k < p; k++) {
                mass[m][k]=array[p-1-k][m];
                System.out.print(mass[m][k]+" ");
            }
System.out.println();
        }

    }
}