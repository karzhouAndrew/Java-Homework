package homework.work3;

import java.util.Scanner;

/*найти сумму первых n чисел, которые делятся на 3*/

public class Task11 {
    public static void main(String[] args) {
        int number, sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        number = in.nextInt();
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("Сумма первых " + number + " чисел, которые делятся на 3, равна - " + sum);
        in.close();
    }
}

