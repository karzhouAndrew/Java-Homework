package practice;

import java.util.Random;

public class chooseSortPartTwo {
    public static void main(String[] args) {

        int[] array = new int[40];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100) + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();




        for (int i = 0; i < array.length; i++) {
            int minIndexNumber = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndexNumber]) {
                    minIndexNumber = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndexNumber];
            array[minIndexNumber] = temp;
        }






        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
