package workbook.task_5;

/**
 * Created by Алексей Андреенко on 05.02.2015.
 * Имеется целое число (любое), это число - сумма денег в рублях. Вывести это число, добавив к нему слово "рублей" в
 * правильном падеже.
 */
public class Rubles {
    public static void main(String[] args) {
        int r = 88830;
        if (r % 10 == 1) {
            System.out.println(r + " рубль");
        } else if (r % 10 == 2 || r % 10 == 3 || r % 10 == 4) {
            System.out.println(r + " рубля");
        } else
            System.out.println(r + " рублей");
    }
}
