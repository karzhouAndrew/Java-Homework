package workbook.task7;

/**
 * Created by Admin on 09.02.2015.
 */
public class Task7 {
        public static void main(String[] args) {
        int x = 2347;
        int d = x % 10;
        int x1 = x / 10;
        int c = x1 % 10;
        x1 /= 10;
        int b = x1 % 10;
        int a = x1 / 10;
        if(a != b && a != c && a != d && b != c && b != d && c != d) {
            System.out.println("Верно");
        } else {
            System.out.println("Не верно");
        }

    }
}
