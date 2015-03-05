package workbook.task_9;

/**
 * Created by Администратор on 08.02.2015.
 * Как в примере, имеется последовательность случайных чисел, найти и вывести наибольшее из них.
 */
public class Bigest {
    public static void main(String[] args) {
        int bNum = 0;
        int x = (int) (Math.random() * 20);
        while (x != 0) {
            if (bNum < x) {
                bNum = x;
            }
            System.out.print("x=" + x + " ");
            x = (int) (Math.random() * 20);
        }
        System.out.println();
        System.out.println("Наибольшее число: " + bNum);
    }
}
