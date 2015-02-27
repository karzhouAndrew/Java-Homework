package workbook.lab6;

/**
 * Created by Asus on 21.02.2015.
 */
public class Six {
    public static void main(String[] args) {
        int n = (int)(Math.random() * 1000000);
        int d, c;
        int k = 10;
        int f = 1;
        while (n > 10) {
            d = n % k;
            if (d > 0) {
                n = n - d;
                c = d / f;
                f = f * 10;
                k = k * 10;
                System.out.print(c);
            } else {
                System.out.print(0);
                f = f * 10;
                k = k * 10;
                n = n - d;
            }
        }
    }
}
