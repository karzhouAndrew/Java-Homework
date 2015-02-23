package practice;

import java.util.Random;

public class choosSortTesr {
    public static void main(String[] args) {
        int[] mass = new int[10];
        Random rand = new Random();

        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(50) + 1;
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < mass.length; i++) {
            int minIndex = i;

            for (int j = i + 1; j < mass.length; j++) {
                if (mass[j] < mass[minIndex]) {

                    minIndex = j;
                }
            }
            int temp = mass[i];
            mass[i] = mass[minIndex];
            mass[minIndex] = temp;
        }

        for (int i = 0; i < mass.length; i++) {

            System.out.print(mass[i] + " ");
        }


    }

}