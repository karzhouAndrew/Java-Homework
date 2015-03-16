package workbook.lab3;

/**
 * Created by Sam on 20.02.2015.
 * Создать число. Проверить, является ли последняя цифра числа семеркой
 */
public class CheckDivBy7 {
    public static void main(String[] args) {
        int val1 = 2147;
        int val2 = 1293;
        if ((val1 - 7) % 10 == 0) {
            System.out.println("Число " + val1 + " имеет на конце 7");
        } else {
            System.out.println("Число " + val1 + " не имеет на конце 7");
        }

        if ((val2 - 7) % 10 == 0) {
            System.out.println("Число " + val2 + " имеет на конце 7");
        } else {
            System.out.println("Число " + val2 + " не имеет на конце 7");
        }
    }

}
