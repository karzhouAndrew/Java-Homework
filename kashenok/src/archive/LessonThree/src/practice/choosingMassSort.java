package practice;

import java.util.Random;

public class choosingMassSort {
    public static void main(String[] args) {
        int[] mass = new int[10];
        Random rand = new Random();

        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(50) + 1;
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        // Находим индекс минимального значения массива
        //Finding index of minimal number

        for (int i = 0; i < mass.length; i++) {
            int minNumIndex = i;
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[j] < mass[minNumIndex]) {
                    minNumIndex = j;
                }

            }
            int temp = mass[i];
            mass[i] = mass[minNumIndex];
            mass[minNumIndex] = temp;
        }




        for (int i = 0; i < mass.length; i++) {

            System.out.print(mass[i] + " ");
        }
    }

}

