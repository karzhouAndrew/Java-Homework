package workbook.lab3;

/**
 * Created by Sam on 20.02.2015.
 * Создать число. Проверить, является ли последняя цифра числа семеркой
 */
public class CheckDivBy7 {
    public static void main(String[] args) {
        int testVal1 = 2147;
        int testVal2 = 1293;
        if ((testVal1 - 7) % 10 == 0) {
            System.out.println("Число " + testVal1 + " имеет на конце 7");
        } else {
            System.out.println("Число " + testVal1 + " не имеет на конце 7");
        }
        if ((testVal2 - 7) % 10 == 0) {
            System.out.println("Число " + testVal2 + " имеет на конце 7");
        } else {
            System.out.println("Число " + testVal2 + " не имеет на конце 7");
        }
    }

}
