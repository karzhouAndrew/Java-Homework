package workbook.lab14;

import java.util.Random;

public class TheSumBetweenLimitsOfValues {
    public static void main(String[] args) {
        int min = 0, max = 0, sum = 0;
        int n = 10;
        int range = 20;

        Random rand = new Random();
        int[] massif = new int[n];
        for (int i = 0; i < n; i++) {
            massif[i] = rand.nextInt(range);
        }

        System.out.println("array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(massif[i] + " ");
            if (massif[i] < massif[min]) min = i;
            if (massif[i] > massif[max]) max = i;
        }
        if (min < max) {
            for (int i = min; i <= max; i++)
                sum += massif[i];
        } else {
            for (int i = min; i >= max; i--)
                sum += massif[i];
        }
        System.out.println("\nThe sum of elements between minimum and maximum (first) values = " + sum);
    }
}

		
			  