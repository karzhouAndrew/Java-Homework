package workbook.test8;

/**
 * Created by Natashka on 08.02.2015.
 */
public class Test8 {
    public static void main(String[] args) {
        int number = 10;
        double factorial = 1.0;
        System.out.print("Факториал числа " + number + " равен ");
        while (number > 1) {
            factorial *= number;
            number--;
        }
        System.out.println(factorial);
    }
}
