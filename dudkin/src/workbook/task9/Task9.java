package workbook.task9;

/**
 * Created by Admin on 09.02.2015.
 */
public class Task9 {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 20);
        int max = x;
        System.out.print(x + " ");

        while (x != 0) {
            x = (int) (Math.random() * 20);
            System.out.print(x + " ");
            if (max < x) {
                max = x;
            }
        }

        System.out.println();
        System.out.print("Максимальное: " + max);
    }
}
