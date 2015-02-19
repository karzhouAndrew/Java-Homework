package workbook.test11;

/**
 * Created by Natashka on 08.02.2015.
 */
public class Test11 {
    public static void main(String[] args) {
        int n = 10;
        int number = 1;
        int counter = 0;
        int sum = 0;
        while (counter < n) {
            if (number % 3 == 0) {
                sum += number;
                counter++;
            }
            number++;
        }
        System.out.print("Сумма первых " + n + " чисел, которые делятся на 3 равна " + sum);

    }
}

