package workbook.task10;

/**
 * Created by Admin on 09.02.2015.
 */
public class Task10 {
    public static void main(String[] args) {
        int x = 23;
        int n = 0;

        for (int i = 2; i <= x / 2; ++i) {
            if (x % i == 0) {
                ++n;
            }
        }

        if (n == 0) {
            System.out.println("Простое");
        } else {
            System.out.println("Составное");
        }

    }
}
