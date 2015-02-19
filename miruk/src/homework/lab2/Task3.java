package homework.lab2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] arg) {
        int num = 157;
        if (num % 10 == 7) {
            System.out.println("Последняя цифра числа " + num + " - 7.");
        } else {
            System.out.println("Последняя цифра числа " + num + " не являетя 7.");
        }
    }
}
