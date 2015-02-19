package workbook.lab5;

/**
 * Created by Sam on 20.02.2015.
 * Имеется целое число (любое), это число - сумма денег в рублях.
 * Вывести число, добавив к нему слово "рублей" в правильном падеже
 */
public class RubleEnd {
    public static void main(String[] args) {
        int sum = 323;
        int end = sum % 10;
        String strVal = " рубль";
        switch (end) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                strVal = " рублей";
                break;
            case 1:
                strVal = " рубль";
                break;
            case 2:
            case 3:
            case 4:
                strVal = " рубля";
                break;
        }
        System.out.println(sum + strVal);
    }
}
