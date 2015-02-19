package classes.classwork11;

/**
 * Created by Natashka on 09.02.2015.
 */
public class job11 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(array[i][j] + " ");
                sum += array[i][j];
            }
            System.out.println();
        }
        System.out.println("Сумма равна " + sum);
    }
}
