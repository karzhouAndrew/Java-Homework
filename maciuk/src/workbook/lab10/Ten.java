package workbook.lab10;

/**
 * Created by Asus on 21.02.2015.
 */
public class Ten {
    public static void main(String[] args) {
        int n = 1;
        int d = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                d++;
            }
        } if (d > 0) {
            System.out.println("число является сложным");
        } else {
            System.out.println("число яаляется простым");
        }
    }
}
