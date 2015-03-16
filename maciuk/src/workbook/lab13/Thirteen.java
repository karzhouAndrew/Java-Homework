package workbook.lab13;

/**
 * Created by Asus on 21.02.2015.
 */
public class Thirteen {
    public static void main(String[] args) {
        int array[][] = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int j = 0; j <= 2; j++) {
            for (int i = 2; i >= 0; i--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
