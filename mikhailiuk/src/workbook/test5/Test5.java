package workbook.test5;

/**
 * Created by Natashka on 05.02.2015.
 */
public class Test5 {
    public static void main(String[] args) {
        int sum = 19700;
        if ((sum % 100 > 4 && sum % 100 < 21) || (sum % 10 > 4 && sum % 10 < 10) || (sum % 10 == 0)) {
            System.out.println(sum + " рублей");
        } else if (sum % 10 == 1) {
            System.out.println(sum + " рубль");
        } else if (sum % 10 > 1 && sum % 10 < 5) {
            System.out.println(sum + " рубля");
        }
    }
}
