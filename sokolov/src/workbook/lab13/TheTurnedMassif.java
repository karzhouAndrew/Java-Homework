package workbook.lab13;

import java.util.Random;

public class TheTurnedMassif {
    public static void main(String[] args) {
        int category = 5;
        int n = category - 1;
        int b;
        int number = 101;
        int[][] M = new int[category][category];
        Random rand = new Random();

        for (int i = 0; i < category; i++)
            for (int j = 0; j < category; j++) {
                M[i][j] = rand.nextInt(number);
            }

        System.out.println("Type of a matrix to a turn: ");
        for (int i = 0; i < category; i++) {
            for (int j = 0; j < category; j++)
                System.out.print(M[i][j] + "\t");
            System.out.println();
        }

        for (int i = 0; i < category; i++)
            for (int j = i; j < category; j++) {
                b = M[i][j];
                M[i][j] = M[j][i];
                M[j][i] = b;
            }

        for (int i = 0; i < category; i++)
            for (int j = 0; j < category / 2; j++) {
                b = M[i][j];
                M[i][j] = M[i][n - j];
                M[i][n - j] = b;
            }

        System.out.println("Type of a matrix after a turn: ");
        for (int i = 0; i < category; i++) {
            for (int j = 0; j < category; j++)
                System.out.print(M[i][j] + "\t");
            System.out.println();
        }
    }
}		