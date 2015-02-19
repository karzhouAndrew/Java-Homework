package workbook.test10;

/**
 * Created by Natashka on 08.02.2015.
 */
public class Test10 {
    public static void main(String[] args) {
        int number = 3571;
        for (int i = 2; i < number/2; i++) {
            if (number % i == 0) {
                System.out.print("Число " + number + " не является простым");
                break;
            }
        }
        System.out.print("Число " + number + " является простым");
    }
}
