package homework.work3;

import java.util.Scanner;

/*имеется целое число, определить является ли это простым, т.е. делиться без остатка только 1 и себя*/

public class Task10 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        int simple = 2;
        for (int i = 2; i <= Math.pow(number, 0.5); i++) {
            if (number % i == 0) {
                simple++;
                break;
            }
        }
        if ((simple == 2) || (number == 1)) {
            System.out.println("Число " + number + " является простым.");
        } else {
            System.out.println("Число " + number + " не является простым.");
        }
    }
}
