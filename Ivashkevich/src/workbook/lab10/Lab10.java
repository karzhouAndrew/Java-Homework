package workbook.lab10;

import java.util.Scanner;

/**
 * Имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и себя.
 */
public class Lab10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nВведите число:  ");
        int number = input.nextInt();
        int j = 0;
        System.out.println("\nданное число    " + number + " делится без остатка на:");
        System.out.print('\n');
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (i != 1 || i != number) {
                    j = j + 1;
                    System.out.print("  " + i);
                }
            }
        }
        System.out.println('\n');
        if (j <= 2) {
            System.out.println("является простым");
        } else {
            System.out.println("не является простым");
        }
    }
}


