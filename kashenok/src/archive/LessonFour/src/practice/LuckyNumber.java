package practice;

import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите желаемое число для проверки: ");
        int number = scan.nextInt();
        int firstDigit = number / 100;
        int thirdDigit = number % 10;
        int secondDigit = (number - thirdDigit)/10 - firstDigit * 10;


        System.out.println(firstDigit);
        System.out.println(secondDigit);
        System.out.println(thirdDigit);

        if (firstDigit == secondDigit && secondDigit == thirdDigit) {
            System.out.print("Введенное число: " + number + " является СЧАСТЛИВЫМ!");
        } else if (thirdDigit == secondDigit + 1 && secondDigit == firstDigit + 1) {
            System.out.print("Введенное число: " + number + " является СЧАСТЛИВЫМ!");
        } else if (number == 781 || number == 302 || number == 409 || number == 941) {
            System.out.print("Введенное число: " + number + " является МАГИЧЕСКИМ!");
        } else {
            System.out.print("Введенное число: " + number + " является НЕСЧАСТЛИВЫМ!");
        }


    }
}
