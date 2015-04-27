package workbook.lab9;

import java.util.Random;

public class TheGreatestNumber {
    public static void main(String[] args) {
        int number = 10;
        int range = 40;
        int max = 0;
        System.out.println("\nSequence of random numbers: ");
        Random rand = new Random();
        for (int i = 0; i < number; i++) {
            int c = rand.nextInt(range);
            System.out.print(c + " ");
            if (c > max) max = c;
        }
        System.out.println("\nThe maximum number in sequence is: " + max);
    }
}