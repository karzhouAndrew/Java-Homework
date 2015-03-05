package workbook.task_8;

/**
 * Created by Администратор on 08.02.2015.
 * Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а произведение, т.е. факториал числа.
 */
public class Factorial {
    public static void main(String[] args) {
        int sum = 1;
        int n = 1;
        int x = (int) (Math.random() * 20);
        while (n <= x) {
            sum *= n;
            n++;
        }
        System.out.print("Факториал числа " + x + " : " + sum);
    }

}

