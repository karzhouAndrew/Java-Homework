package classwork.class1;

import java.util.Scanner;

/*Определить сумму первых трех цифр дробной части заданного положительного вещественного числа*/

public class Task_dop1 {
    public static void main(String[] args) {
        System.out.print("Введите дробное число: ");
        Scanner sc = new Scanner(System.in);
        float number = sc.nextFloat();
        int res = 0;
        int x = (int) number;
        double drob = number - (float) x;
        if (drob == 0.0) {
            System.out.println("У этого числа нет дробной части!");
            return;
        }
        System.out.print("Введите сколько чисел после запятой сложить: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            drob *= 10;
            x = (int) drob;
            res += x;
            drob -= (float) x;
        }
        System.out.println("Сумма первых " + n + " цифр дробной части заданного положительного вещественного числа " + res);
    }
}



