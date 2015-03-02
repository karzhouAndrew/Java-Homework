package workbook;

/**
 * Создайте число. Определите, является ли последняя цифра числа семеркой.
 */
public class lab3 {
    public static void main(String[] args) {
        int num = 107;
        if (num % 10 == 7) {
            System.out.println("Да, является.");
        } else {
            System.out.println("Нет, не является.");
        }
    }
}

