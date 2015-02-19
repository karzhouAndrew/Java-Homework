package workbook.test6;

/**
 * Created by Natashka on 05.02.2015.
 */
public class Test6 {
    public static void main(String[] args) {
        long num = 9876543210L;
        long digit = 0;
        while (num > 0) {
            digit = num % 10;
            num = (num - digit) / 10;
            System.out.print(digit);
        }
    }
}
