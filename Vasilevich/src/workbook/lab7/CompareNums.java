package workbook.lab7;

/**
 * Created by Sam on 20.02.2015.
 * Дано любое натуральное число n. Верно ли что все цифры числа различны?
 */
public class CompareNums {
    public static void main(String[] args) {
        int val = 9394;
        int val1 = val % 10;
        int val2 = (val - val1) % 100;
        int val3 = (val - val1 - val2) % 1000;
        int val4 = (val - val1 - val2 - val3);

        val2 /= 10;
        val3 /= 100;
        val4 /= 1000;

        System.out.println(val + " = " + val4 + ' ' + val3 + ' ' + val2 + ' ' + val1);
        if ((val1 != val2) && (val1 != val3) && (val1 != val4) && (val2 != val3) && (val2 != val4) && (val3 != val4)) {
            System.out.println("Все цифры разные");
        } else {
            System.out.println("Есть одинаковые цифры");
        }
    }
}
