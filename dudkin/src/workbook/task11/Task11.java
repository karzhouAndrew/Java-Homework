package workbook.task11;

/**
 * Created by Admin on 09.02.2015.
 */
public class Task11 {
    public static void main(String[] args) {
        int n = 6;
        int sum = 0;

        for (int i = 1; n != 0; ++i) {
            if (i % 3 == 0) {
                --n;
                sum += i;
            }
        }

        System.out.println("Сумма " + sum);
    }
}
