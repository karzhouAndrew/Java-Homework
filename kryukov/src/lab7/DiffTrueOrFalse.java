package lab7;

/**
 * Created by KPS on 25.02.2015.
 */
public class DiffTrueOrFalse {
    public static void main(String[] args) {
        int n = 1327;
        int a = n / 1000;
        int b = n / 100 % 10;
        int c = n / 10 % 10;
        int d = n % 10;
        if (a != b && a != c && a != d && b != c && b != d && c != d) {
            System.out.println("Все цифры числа различны");
        } else System.out.println("Есть совпадения цифр");
    }
}
