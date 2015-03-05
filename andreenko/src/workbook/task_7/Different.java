package workbook.task_7;

/**
 * Created by Алексей Андреенко on 05.02.2015.
 * Дано любое натуральное число n. Верно ли, что все цифры числа различны?
 */
public class Different {
    public static void main(String[] args) {
        int n = 2341;
        int a = n % 10;
        int b = (n % 100 - a) / 10;
        int c = (n % 1000 - n % 100) / 100;
        int d = (n % 10000 - n % 1000) / 1000;
        if (a != b && a != c && a != d && b != c && b != d && c != d) {
            System.out.println("В числе " + n + " все цифры разные");
        } else {
            System.out.println("В числе " + n + " есть одинаковые цифры");

        }
    }
}