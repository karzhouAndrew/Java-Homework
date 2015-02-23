package classwork.class1;

import java.util.Scanner;

/**
 * Счастливое число, это число у которого все цифры совпадают (например 777),
 * либо число у которого каждая последующая цифра на 1 больше предыдущей (123 или 456),
 * а также счастливыми являются числа 781, 302, 409 и 941 (такие числа будет называть “Магическими”).
 * Программа должна вывести на экран входное число ( только в случае если оно было сгенерировано)
 * и результат какое число попалось: “Счастливое”, “Несчастливое” или “Магическое”.
 */
public class Task_dop4 {
    public static void main(String[] args) {
        int number;
        do {
            System.out.print("Введите трехзначное число: ");
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
        }
        while (number > 1000);

        int three = number % 10;
        int two = (number % 100 - three) / 10;
        int first = (number % 1000 - two) / 100;

        if ((first == two) && (two == three)) {
            System.out.println("Число " + number + " счастливое");
        } else if ((first + 1 == two) && (two + 1 == three)) {
            System.out.println("Число " + number + " счастливое");
        } else if ((number == 302) || (number == 781) || (number == 409) || (number == 941)) {
            System.out.println("Число " + number + " магическое");
        } else {
            System.out.println("Число " + number + " несчастливое");
        }
    }
}
