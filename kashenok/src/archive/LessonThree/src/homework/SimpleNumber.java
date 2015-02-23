package homework;

import java.util.Random;
import java.util.Scanner;

public class SimpleNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите число для проверки: ___");
        int num = input.nextInt();
        int[] arr = new int[num];

        // если число делится без остатка хотя бы на одно из чисел, ему предшествующих, то оно не является простым

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.print("Введенное число является составным");
                break;
            } else {
                System.out.print("Введенное число является простым");
                break;
            }

        }
    }
}
