package added.lab1;

/**
 * Created by Sam on 21.02.2015.
 * Определить сумму первых трех цифр дробной части заданного положительного вещественного числа
 */
public class SumFloatPart {
    public static void main(String[] args) {
        double val = 213.1389;
        int val1 = (int) (val * 10) % 10;
        int val2 = (int) (val * 100) % 10;
        int val3 = (int) (val * 1000) % 10;
        int sum = val1 + val2 + val3;
        System.out.println("Result = " + sum);
    }
}
