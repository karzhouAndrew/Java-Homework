package workbook.test11;

/**
 * Created by Natashka on 08.02.2015.
 */
public class Test11_2 {
    public static void main(String[] args) {
        int n = 5; //сколько надо первых чисел
        int divider = 5; //на что надо чтоб делились
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i * divider;
        }
        System.out.print("Сумма первых " + n + " чисел, которые делятся на " + divider + " равна " + sum);
    }
}
