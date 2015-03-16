package workbook.lab5;

/**
 * Created by Asus on 21.02.2015.
 */
public class Five {
    public static void main(String[] args) {
        int x = 111;
        if (x % 10 == 1 && 11 != x % 100) {
            System.out.println(x + "рубль");
        } else if (x % 10 == 2 || x % 10 == 3 || x % 10 == 4) {
            System.out.println(x + "рубля");
        } else {
            System.out.println(x + "рублей");
        }
    }
}