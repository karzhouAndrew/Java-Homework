package workbook.task_6;

/**
 * Created by Алексей Андреенко on 10.02.2015.
 * Определить число, полученное выписыванием в обратном порядке цифр любого натурального числа n.
 */
public class Reverse {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 1000000000);
        System.out.println("Случайное число: " + n + "\n \nВывод в обратном порядке:");
        for (int i = 10; n > 0; ) {
            int x = n % i;
            n = (n - x) / 10;
            System.out.print(x);
        }
    }
}
