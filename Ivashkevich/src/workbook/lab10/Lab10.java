package workbook.lab10;

import java.util.Scanner;

/**
 * Имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и себя.
 */
public class Lab10 {
    public static void main(String[] args) {
        double number = 0;
        InputNumber inputNumber = new InputNumber();
        number = inputNumber.inputNumber();
        for (double i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println("не является простым");
                break;
            }
        }
    }
}



