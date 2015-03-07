package LuckyNumber;

import java.util.Scanner;

public class Number {

    public static int GetNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите желаемое число для проверки: ");
        int number = scan.nextInt();
        return number;
    }


}
