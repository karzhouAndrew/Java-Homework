package workbook.lab9;

/**
 * Created by Asus on 21.02.2015.
 */
public class Nine {
    public static void main(String[] args) {
        int n = 0;
        int d = 0;
        int x = (int) (Math.random() * 20);
        while (x != 0) {
            if (x > d) {
                d = x;
            }
            n++;
            x = (int) (Math.random() * 20);
        }
        if (n != 0) {
            System.out.println("Наибольшее число = " + d);
        } else {
            System.out.println("случайное число = 0");
        }
    }
}
