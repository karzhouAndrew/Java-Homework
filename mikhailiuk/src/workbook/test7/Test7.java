package workbook.test7;

/**
 * Created by Natashka on 05.02.2015.
 */
public class Test7 {
    public static void main(String[] args) {
        int num = 123123123;
        int digit = 0;
        int i = 1;
        int k = 0;
        int[] array = new int[10];

        while ((num > 0) && (i < 11)) {
            digit = num % 10;
            array[digit]++;
            if (array[digit] > 1) {
                k = 1;
            }
            num = (num - digit) / 10;
            i++;
        }
        if ((num > 0) || (k == 1)) {
            System.out.print("Число содержит повторяющиеся цифры");
        } else {
            System.out.print("Число НЕ содержит повторяющиеся цифры");
        }
    }
}
