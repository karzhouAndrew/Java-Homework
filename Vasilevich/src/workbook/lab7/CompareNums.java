package workbook.lab7;

/**
 * Created by Sam on 20.02.2015.
 * Дано любое натуральное число n. Верно ли что все цифры числа различны?
 */
public class CompareNums {
    public static void main(String[] args) {
        int testVal = 9394;
        int firstDigit = testVal % 10;
        int secondDigit = (testVal - firstDigit) % 100;
        int thirdDigit = (testVal - firstDigit - secondDigit) % 1000;
        int fourthDigit = (testVal - firstDigit - secondDigit - thirdDigit);
        secondDigit /= 10;
        thirdDigit /= 100;
        fourthDigit /= 1000;
        System.out.println(testVal + " = " + fourthDigit + ' ' + thirdDigit + ' ' + secondDigit + ' ' + firstDigit);
        if ((secondDigit != secondDigit) && (firstDigit != thirdDigit) && (secondDigit != fourthDigit) && (secondDigit != thirdDigit) && (secondDigit != fourthDigit) && (thirdDigit != fourthDigit)) {
            System.out.println("Все цифры разные");
        } else {
            System.out.println("Есть одинаковые цифры");
        }
    }
}
