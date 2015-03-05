package homework.task_1.task_11;

/**
 * Created by Администратор on 08.02.2015.
 * Найти сумму первых n целых чисел, которые делятся на 3.
 */
public class Summofn {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Выводим первые " + n + " чисел, которые делятся на 3 и их сумму:");
        System.out.println();
        int k = 1;
        int sum = 0;
        for (int i = 1; k <= n; i++) {
            if (i % 3 == 0) {
                sum += i;
                System.out.println("Число № " + k + " = " + i);
                k++;
            }
        }
        System.out.println();
        System.out.println("Сумма чисел = " + sum);
    }
}
