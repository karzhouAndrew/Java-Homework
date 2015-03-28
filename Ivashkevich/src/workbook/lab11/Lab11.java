package workbook.lab11;

import java.util.Scanner;

/**
 * Найдите сумму первых n целых чисел, которые делятся на 3.
 */
public class Lab11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nВведите колличество чисел: ");
        int numberOfNumbers = input.nextInt();
        int summ = 0;
        int j = 0;
        for (int i = -100; i <= 5000; i++) {
            if (i == 0) {
                continue;
            }
            if (i % 3 == 0) {
                j++;
                summ += i;
                if (j % 20 == 0) {
                    System.out.println(i + " ");
                } else {
                    System.out.print(i + " ");
                }
            }

            if (j == numberOfNumbers) {
                break;
            }
        }

        System.out.println("Сумма первых " + numberOfNumbers + " чисел кратных 3 равна:  " + summ);
    }
}



