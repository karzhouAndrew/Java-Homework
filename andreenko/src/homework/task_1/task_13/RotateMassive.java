package homework.task_1.task_13;

/**
 * Created by Администратор on 08.02.2015.
 * Создать массив, заполнить его случайными элементами, распечатать, перевернуть и снова распечатать.
 */
public class RotateMassive {
    public static void main(String[] args) {
        int m = 6;
        int mass[][] = new int[m][m];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < m / 2; i++) {
            for (int j = i; j < m - 1 - i; j++) {
                int temp = mass[j][m - 1 - i];
                mass[j][m - 1 - i] = mass[i][j];
                mass[m - 1 - i][m - 1 - j] = mass[j][m - 1 - i];
                mass[m - 1 - j][i] = mass[m - 1 - i][m - 1 - j];
                mass[m - 1 - i][m - 1 - j] = temp;
            }
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }
    }
}