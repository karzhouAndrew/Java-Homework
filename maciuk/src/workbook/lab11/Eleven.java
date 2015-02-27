package workbook.lab11;

/**
 * Created by Asus on 21.02.2015.
 */
public class Eleven {
    public static void main(String[] args) {
        int n = 0;
        int sum = 0;
        for (int i = 1; n < 3; i++) {
            if (i % 3 == 0) {
                sum += i;
                n++;
            }
        }
        System.out.println("Сумма первых целых чисел которые деляться на три = " + sum);
    }
}


