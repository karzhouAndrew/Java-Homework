package practice;

import java.util.Random;

public class BubbleSortPartTwo {
    public static void main(String[] args) {
        int[] mass = new int[20];
        Random rand = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(100) + 1;
            System.out.print(mass[i] + " ");
        }

        System.out.println();        System.out.println();


        for (int i = 0; i < mass.length; i++) {
            for (int j = mass.length - 1; j > i; j--) {
                if (mass[j] < mass[j - 1]) {
                    int temp = mass[j];
                    mass[j]=mass[j-1];
                    mass[j-1] = temp;
                }
            }
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
    }
}
