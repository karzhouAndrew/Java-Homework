package workbook.lab7;

/**
 * Created by Asus on 21.02.2015.
 */
public class Seven {
    public static void main(String[] args) {
        int n = 1000;
        int a = n / 1000;
        int b = (n / 100) % 10;
        int c = (n / 10) % 10;
        int d = n % 10;
        if ((n == (a * 1000 + b * 100 + c * 10 + d)) && (a >= 0 && a <= 9) && (b >= 0 && b <= 9) && (c >= 0 && c <= 9) && (d >= 0 && d <= 9) && a != b && a != c && a != d && b != c && b != d && c != d) {
            System.out.println("все цифры числа различны");
        } else {
            System.out.println("не все цифры числа различны");
        }
    }
}

