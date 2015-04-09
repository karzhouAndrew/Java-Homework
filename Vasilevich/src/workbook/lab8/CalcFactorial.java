package workbook.lab8;

/**
 * Created by Sam on 20.02.2015.
 * Изменить пример с суммой так, чтобы расчитывалась не сумма, а произведение
 */
public class CalcFactorial {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 20);
        long mod = 1;
        while (x != 0) {
            mod *= x;
            x = (int) (Math.random() * 20);
        }
        System.out.println("Факториал = " + mod);
    }
}
